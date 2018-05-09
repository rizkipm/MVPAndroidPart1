package superheroku.id.co.mvpandroid_1.views.main;


import superheroku.id.co.mvpandroid_1.model.Data;
import superheroku.id.co.mvpandroid_1.views.base.Presenter;


public class MainPresenter implements Presenter<MainView> {
    private MainView mView;

    @Override
    public void onAttach(final MainView view) {
        mView = view;
    }

    @Override
    public void onDetach() {
        mView = null;
    }

    public void showFragment() {
        // Set Data
        final Data data = new Data();
        data.setText("Hello from Data!");

        // Show Fragment with Data
        mView.onShowFragment(data);
    }
}