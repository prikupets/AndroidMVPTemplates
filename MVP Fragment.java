package ${PACKAGE_NAME};

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

#set($lowercasedFileName = $NAME.substring(0,1).toLowerCase() + $NAME.substring(1))

public class ${NAME}Fragment extends Fragment implements ${NAME}Contract.View {
    protected ${NAME}Contract.Presenter presenter;
    private Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_${lowercasedFileName}, container, false);
        unbinder = ButterKnife.bind(this, view);
        presenter.attach(this);
        setUp();
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        presenter.detach();
        unbinder.unbind();
    }

    private void setUp() {

    }
}
