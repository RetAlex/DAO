package libs.DAO.exceptions;

import java.lang.reflect.Field;

public class InvalidColumnNameException extends WrongDeclarationException {
    public InvalidColumnNameException(Field field) {
        super("Column name is invalid: ["+field.getDeclaringClass().getName()+"] "+field.getName());
    }
}
