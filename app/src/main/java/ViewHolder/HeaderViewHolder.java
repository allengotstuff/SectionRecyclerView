package ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.pheth.hasee.sectionrecyclerview.R;

/**
 * *************************************************************************
 *
 * @版权所有: 北京云图微动科技有限公司 (C) 2016
 * @创建人: 孙旭光
 * @创建时间: xxx(2016-12-07 15:21)
 * @Email: 410073261@qq.com
 * <p>
 * 描述:ViewHolder-HeaderViewHolder
 * <p>
 * <p>
 * *************************************************************************
 */

public class HeaderViewHolder extends RecyclerView.ViewHolder {

    public TextView textview;

    public HeaderViewHolder(View v) {
        super(v);

        textview = (TextView) itemView.findViewById(R.id.header_text);

    }

}
