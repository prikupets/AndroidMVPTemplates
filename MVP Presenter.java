package ${PACKAGE_NAME};

import org.greenrobot.eventbus.EventBus;

public class ${NAME}Presenter implements ${NAME}Contract.Presenter {
    protected ${NAME}Contract.View view;

    @Override
    public void attach(${NAME}Contract.View view) {
        this.view = view;
        EventBus.getDefault().register(this);
    }

    @Override
    public void detach() {
        view = null;
        EventBus.getDefault().unregister(this);
    }
}
