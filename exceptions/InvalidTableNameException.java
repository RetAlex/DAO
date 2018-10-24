package libs.DAO.exceptions;

public class InvalidTableNameException extends WrongDeclarationException {
    public InvalidTableNameException(Class table) {
        super("Invalid table name for class ["+table.getName()+"]");
    }
}
