package com.example.listviewclickdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by KunGe on 2017/11/16.
 */

public class FragmentLeft extends Fragment implements AdapterView.OnItemClickListener{
    /**
     * ListView 适配器
     */
    private ArrayAdapter<String> adapter;

    /**
     *  用于ListView显示的数据
     */
    private String[] lvData = {"单选题","多选题","填空题"};

    /**
     * ListView
     */
    private ListView listView;
    /**
     * 当前视图变量记录
     */
    private View view;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.layout_fragment_left, container,false);
        listView = (ListView)view.findViewById(R.id.id_lv_topic);
        adapter = new ArrayAdapter<String>(view.getContext(), android.R.layout.simple_list_item_1,lvData);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        return view;
    }


    /**
     * ListView 点击事件
     * @param parent
     * @param view
     * @param position  点击ListView中条目的位置
     * @param id
     */
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position)
        {
            case 0:
                toggleFragment(new FragmentRight1());
                break;
            case 1:
                toggleFragment(new FragmentRight2());
                break;
            case 2:
                toggleFragment(new FragmentRight3());
                break;

            default:break;
        }
    }

    /**
     * 切换显示右侧的Fragment
     * @param fragment
     */
    private void toggleFragment(Fragment fragment) {
        getFragmentManager().beginTransaction().replace(R.id.id_framelayout_right, fragment).commit();
    }
}
