package chapter.android.aweme.ss.com.homework;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * 大作业:实现一个抖音消息页面,所需资源已放在res下面
 */
public class Exercises3 extends AppCompatActivity {

    private news[] news;
    private BaseAdapter mylistatapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercises3);
        ListView listview = findViewById(R.id.list);
        initData();
        mylistatapter = new listadapter(this,news);
        listview .setAdapter(mylistatapter);

    }
    private void initData(){
        news = new news[50];
        for(int i = 0; i<news.length;i++){
            news mnew = new news("AABBCC","123321123",i+"分钟前");
            news[i]=mnew;
        }
    }
    public class news {
        private String tv_title;
        private String tv_description;
        private String tv_time;
        public news(String tv_title,String tv_description,String tv_time){
            this.tv_description = tv_description;
            this.tv_time = tv_time;
            this.tv_title = tv_title;
        }
    }
    public static class listadapter extends BaseAdapter{

        private Context mContext;
        private news[] news;
        public listadapter(Context mContext,news[] news) {
            this.mContext = mContext;
            this.news = news;
        }
        @Override
        public int getCount() {
            return news.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View itemView;
            if(convertView == null){
                itemView = layoutInflater.inflate(R.layout.im_list_item,null);
            }else {
                itemView = convertView;
            }
            TextView tvtitle = (TextView) itemView.findViewById(R.id.tv_title);
            TextView tvdescription = (TextView) itemView.findViewById(R.id.tv_description);
            TextView tvtime = (TextView) itemView.findViewById(R.id.tv_time);
            tvtitle.setText(news[position].tv_title);
            tvdescription.setText(news[position].tv_description);
            tvtime.setText(news[position].tv_time);
            return itemView;
        }
    }


}
