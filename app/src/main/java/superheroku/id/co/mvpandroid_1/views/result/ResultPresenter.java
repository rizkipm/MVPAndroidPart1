package superheroku.id.co.mvpandroid_1.views.result;


import superheroku.id.co.mvpandroid_1.views.base.Presenter;


public class ResultPresenter implements Presenter<ResultView> {
    private ResultView mView;

    @Override
    public void onAttach(final ResultView view) {
        mView = view;
    }

    @Override
    public void onDetach() {
        mView = null;
    }

    public void showResult(final String text) {
        mView.onShowResult(text);
    }
}