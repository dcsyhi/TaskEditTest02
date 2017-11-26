package projecttriforce.taskedittest02;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailFragment extends Fragment {
    public DetailFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle args = getArguments();
        int selected = args.getInt("selected");

        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        TextView textView = (TextView)view.findViewById(R.id.textView);
        textView.setText(String.valueOf(selected) + "番目が選択されました");
        return view;
    }
}