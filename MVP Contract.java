package ${PACKAGE_NAME};

public class ${NAME}Contract {
    interface View {
      
    }

    interface Presenter {
        void attach(View view);
        void detach();
    }
}
