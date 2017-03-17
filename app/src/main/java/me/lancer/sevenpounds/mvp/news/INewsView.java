package me.lancer.sevenpounds.mvp.news;

import java.util.List;

import me.lancer.sevenpounds.mvp.base.IBaseView;

/**
 * Created by HuangFangzhi on 2017/3/13.
 */

public interface INewsView extends IBaseView {

    void showTop(List<NewsBean> list);

    void showLatest(List<NewsBean> list);

    void showTheme(List<NewsBean> list);
}
