package libs.DAO.exceptions;

public class IdNotExistsException extends WrongDeclarationException {
    public IdNotExistsException(Class table) {
        super("Id field wasn't found for class ["+table.getName()+"]");
    }
}
