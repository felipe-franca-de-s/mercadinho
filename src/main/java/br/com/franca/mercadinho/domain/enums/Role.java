package br.com.franca.mercadinho.domain.enums;

public enum Role {

    ADMIN, NORMAL;

    public static Role convertRoleStringToRole(String roleString) {
        for (Role roleFor : Role.values()) {
            if (roleString.equals(roleFor.name())) {
                return roleFor;
            }
        }
        return Role.NORMAL;
    }
}
