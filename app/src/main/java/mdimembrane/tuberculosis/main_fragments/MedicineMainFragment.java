package mdimembrane.tuberculosis.main_fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import mdimembrane.tuberculosis.ManagePatients.ManagePatientList;
import mdimembrane.tuberculosis.main.R;

public class MedicineMainFragment extends Fragment {

    public static final int ADD_NEW_MEDICINE = 6,EDIT_MEDICINE = 10;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        View view = inflater.inflate(R.layout.fragment_medicine_main, container, false);

        Button newMedicineBT = (Button) view.findViewById(R.id.addMedicineBT);
        newMedicineBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), ManagePatientList.class);
                intent.putExtra("OPEN_ACTIVITY",ADD_NEW_MEDICINE);
                startActivity(intent);
            }
        });

        Button editMedicineBT = (Button) view.findViewById(R.id.editMedicineBT);
        editMedicineBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), ManagePatientList.class);
                intent.putExtra("OPEN_ACTIVITY",EDIT_MEDICINE);
                startActivity(intent);
            }
        });



        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Medicines");
    }
}
