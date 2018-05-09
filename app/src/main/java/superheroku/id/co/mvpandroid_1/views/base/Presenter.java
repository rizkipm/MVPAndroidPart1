package superheroku.id.co.mvpandroid_1.views.base;


public interface Presenter<T extends View> {
    void onAttach(T view);

    void onDetach();
}