package superheroku.id.co.mvpandroid_1.views.main;


import superheroku.id.co.mvpandroid_1.model.Data;
import superheroku.id.co.mvpandroid_1.views.base.View;


public interface MainView extends View {
    void onShowFragment(Data data);
}