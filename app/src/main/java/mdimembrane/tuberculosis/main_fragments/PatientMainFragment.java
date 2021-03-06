package mdimembrane.tuberculosis.main_fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

import mdimembrane.tuberculosis.ManagePatients.AddNewPatient.AddPatientOne;
import mdimembrane.tuberculosis.ManagePatients.ManagePatientList;
import mdimembrane.tuberculosis.main.R;




public class PatientMainFragment extends Fragment {

    Timer timer;
    ViewPager mViewPager;
    public static final int PATIENT_PROFILE = 1 , DAILY_RECORDS = 2 , EDIT_PATIENTS = 3;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        View view = inflater.inflate(R.layout.fragment_patient_main, container, false);
        mViewPager = (ViewPager) view.findViewById(R.id.pager);
        mViewPager.setAdapter(new CustomPagerAdapter(this.getActivity()));

        Button button = (Button) view.findViewById(R.id.addPatientBT);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), AddPatientOne.class);
                startActivity(intent);
            }
        });

        Button managepatientBT=(Button)view.findViewById(R.id.managePatient);
        managepatientBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), ManagePatientList.class);
                intent.putExtra("OPEN_ACTIVITY",PATIENT_PROFILE);
                startActivity(intent);
            }
        });

        Button DailyRecorfBT=(Button)view.findViewById(R.id.checkupRecord);
        DailyRecorfBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), ManagePatientList.class);
                intent.putExtra("OPEN_ACTIVITY",DAILY_RECORDS);
                startActivity(intent);
            }
        });


        Button EditPatienBT=(Button)view.findViewById(R.id.editPatienBT);
        EditPatienBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), ManagePatientList.class);
                intent.putExtra("OPEN_ACTIVITY",EDIT_PATIENTS);
                startActivity(intent);
            }
        });


        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                mViewPager.post(new Runnable() {

                    @Override
                    public void run() {
                        mViewPager.setCurrentItem((mViewPager.getCurrentItem() + 1) % 3);
                    }
                });
            }
        };
        timer = new Timer();
        timer.schedule(timerTask, 4500, 4500);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Patients");
    }



}
