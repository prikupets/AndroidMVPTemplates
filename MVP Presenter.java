package ${PACKAGE_NAME};

public class ${NAME}Presenter implements ${NAME}Contract.Presenter {
    protected ${NAME}Contract.View view;

    @Override
    public void attach(${NAME}Contract.View view) {
        this.view = view;
    }

    @Override
    public void detach() {
        view = null;
    }
}