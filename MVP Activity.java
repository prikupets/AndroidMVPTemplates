package ${PACKAGE_NAME};

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import butterknife.BindView;
import butterknife.ButterKnife;
import org.greenrobot.eventbus.EventBus;

#set($lowercasedFileName = $NAME.substring(0,1).toLowerCase() + $NAME.substring(1))

public class ${NAME}Activity extends AppCompatActivity implements ${NAME}Contract.View {
    protected ${NAME}Contract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_${lowercasedFileName});
        ButterKnife.bind(this);

        if(presenter == null)
            presenter = new ${NAME}Presenter();

        setUp();
    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
        presenter.attach(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.detach();
        EventBus.getDefault().unregister(this);
    }

    private void setUp() {

    }
}
