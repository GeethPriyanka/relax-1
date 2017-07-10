package com.doerit.action.signin;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.action.AbstractManagementAction;
import com.doerit.exception.SessionNotExist;
import com.doerit.model.Employee;
import com.doerit.model.UserAccount;
import com.doerit.model.type.UserRoleType;
import com.doerit.service.EmployeeService;
import com.doerit.service.UserAccountService;
import com.doerit.util.SessionKey;
import com.doerit.util.SessionUser;

public class SignInAction extends AbstractManagementAction {

	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(SignInAction.class);

	@Autowired private UserAccountService userAccountService;
	@Autowired private EmployeeService employeeService;

	private UserAccount userAccount;

	public String myProfile() throws SessionNotExist {

		/*
		 * user = userAccountService.viewByEmail(getSessionUser().getEmail());
		 * 
		 * populateViewContent(); employee =
		 * employeeService.viewByIdForUniqueResult(user.getClientId());
		 * 
		 * if(employee == null) { addActionError("Your account not found");
		 * return INPUT; }
		 */
		return SUCCESS;
	}

	public String signIn() {

		try {

			clearSessionVariables();

			if (userAccount == null || validateSignIn()) {
				return signInError();
			}

			userAccount = userAccountService.viewByEmailAndPassword(userAccount.getUserName(), userAccount.getUserPassword());
			System.out.println(userAccount);
			if (userAccount == null) {
				addActionError("Invalid credentials");
				return INPUT;
			}

			SessionUser su = getSessionUser(userAccount);

			if (su == null) {
				addActionError("User not found in the respective user category");
				return INPUT;
			} else {
				
				System.out.println(userAccount.getCategoryRelationId());
				
				if(userAccount.getCategoryRelationId().equals("EMPLOYEE")) {
					
					String foreignKey = userAccount.getRelationId();
					
					Employee employee = employeeService.viewById(foreignKey);
					System.out.println(employee);
					if(employee != null) {
						su.setRole("EMPLOYEE");
						su.setRoleName(employee.getUserRole());
						addSessionUser(su);
					} else {
						addActionError("Employee does not exist in the employee repo");
						return INPUT;
					}
				}
				
				/*addLoggerMessage(su.getId(), ActivityLogger.MessageType.SIGN_IN.toString(), "Web Application",
						su.getEmail());*/
				return SUCCESS;
			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			return signInError();
		}
	}

	private String signInError() {
		addActionError("Invalid authentication");
		return INPUT;
	}

	public String changePassword() {
		return SUCCESS;
	}

	protected SessionUser getSessionUser(UserAccount user) {

		SessionUser sessionUser = new SessionUser();
		sessionUser.setUserId(user.getId());
		sessionUser.setEmail(user.getUserName());

		return sessionUser;
	}

	public String signOut() {

		clearSessionVariables();

		return SUCCESS;
	}

	private void clearSessionVariables() {
		try {
			removeSessionVariable(SessionKey.SESSION_USER_ACCOUNT);
			removeSessionVariable(SessionKey.RESPONSE);
			removeSessionVariable(SessionKey.HISTORY_ACTION);

		} catch (SessionNotExist e) {
			logger.error(e);
		}
	}

	private boolean validateSignIn() {
		if (this.userAccount.getUserName().isEmpty()) {
			addFieldError("user.email", "Email cannot be empty");
		}

		if (this.userAccount.getUserPassword().isEmpty()) {
			addFieldError("user.userPassword", "Password cannot be empty");
		}

		return hasErrors();
	}

	public String forgotPassword() {
		return SUCCESS;
	}

	public String passwordRequest() {
		return SUCCESS;
	}

	public UserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

}
