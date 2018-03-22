package com.example.erpframeworkcore.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * LoginRealm
 *
 * @author liy贺兰沁焱-刘洪君
 * @version 1.0
 * 2018-03-22 22:12
 */
public class LoginRealm extends AuthorizingRealm {
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.print("我进来了");
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String loginName  = (String) token.getPrincipal();
        String loginPwd = new String((char[]) token.getCredentials());
        return new SimpleAuthenticationInfo(loginName, loginPwd, getName());
    }
}
