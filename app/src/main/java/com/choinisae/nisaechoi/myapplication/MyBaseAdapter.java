package com.choinisae.nisaechoi.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by donghaechoi on 2016. 7. 1..
 */
public class MyBaseAdapter extends BaseAdapter {

    /**
     * ViewHolder 패턴을 활용한 BaseAdpater
     */

    private List<Model> mData;
    private LayoutInflater mLayoutInflater;

    // MyBaseAdapter의 생성자
    public MyBaseAdapter(Context context, List<Model> data) {
        // 받은 data를 mData에 대입
        mData = data;
        // LayoutInflater = 이 레이아웃을 볼까요 라고 생각하세요
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        // 해당 데이터의 크기를 리턴
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        // 해당 데이터중 입력받은 position에 있는 item을 리턴합니다.
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        // 해당 아이템의 포지션을 리턴
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        // convertView가 존재하지 않을시 정의해주어야 합니다 그렇지 않으면
        // NullPointException 오류를 만나게 됩니다.
        if (convertView == null) {
            // 홀더를 생성
            holder = new ViewHolder();

            // 뷰가 없으면 뷰가 리스트뷰에 들어갈 아이템을 보게 함
            convertView = mLayoutInflater.inflate(R.layout.list_item, parent, false);

            // 리스트뷰에 들어갈 아이템에 있는 View들을 가지고옴 (name, phoneNumber가 들어갈 TextView)
            TextView itemName = (TextView) convertView.findViewById(R.id.item_name);
            TextView itemPhoneNumber = (TextView) convertView.findViewById(R.id.item_phone_number);

            // 홀더의 각 TextView에 TextView를 대입함
            holder.name = itemName;
            holder.phoneNumber = itemPhoneNumber;

            // 재사용을 위해서 (위로올릴때 재호출을 방지하기위해) convertView에 Tag를 달아줌 (생성한 holder)
            convertView.setTag(holder);
        } else {
            // convertView가 null이 아닌 경우에는 앞에서 생성해두었떤 convertView를 가져다가 사용합니다.
            holder = (ViewHolder) convertView.getTag();
        }
        // holder에 item의 이름과 가격을 삽입해줍니다.
        // 모델을 생성 해서 position의 아이템을 가지고 옵니다.
        Model model = (Model) getItem(position);

        // 홀더에 있는 네임(TextView) , 폰넘버(TextView)에 model에서 가져온 값을 삽입함.
        holder.name.setText(model.getName());
        holder.phoneNumber.setText(model.getPhoneNumber());

        return convertView;
    }
}

class ViewHolder {
    // Item 값을 뿌려줄 view를 작성 해 주시면 됩니다.
    TextView name;
    TextView phoneNumber;
}
