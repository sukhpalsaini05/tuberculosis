package mdimembrane.tuberculosis.main;

import android.provider.BaseColumns;


//constants used for database
public interface PreferencesConstants extends BaseColumns {
	public static final String APP_MAIN_PREF = "TuberCulosis";


	public static class PushNotificationConfig
	{
		// global topic to receive app wide push notifications
		public static final String TOPIC_GLOBAL = "global";

		// broadcast receiver intent filters
		public static final String REGISTRATION_COMPLETE = "registrationComplete";
		public static final String PUSH_NOTIFICATION = "pushNotification";

		// id to handle the notification in the notification tray
		public static final int NOTIFICATION_ID = 100;
		public static final int NOTIFICATION_ID_BIG_IMAGE = 101;

	}

	public static class AddNewAccount
	{
		public static final String ACCOUNT_TYPE = "account_type";
		public static final String USER_NAME = "user_name";
		public static final String EMPLOYEE_CODE = "employee_code";
		public static final String GENDER = "gender";
		public static final String USER_STATE = "user_state";
		public static final String USER_DISTT = "user_distt";
		public static final String USER_TEHSIL = "user_tehsil";
		public static final String USER_VILLAGE = "user_village";
		public static final String USER_ADDRESS = "user_address";
		public static final String USER_PINCODE = "user_pincode";
		public static final String HOSPITAL_TYPE = "hospital_type";
		public static final String HOSPITAL_NAME = "hospital_name";
		public static final String USER_PHONE = "user_phone";
		public static final String USER_AADHAR_NO = "user_aadhar_no";

	}


	public static class AddNewPatient
	{
		public static final String CATEGORY_TYPE = "category_type";
		public static final String CATEGORY_ID = "category_id";
		public static final String PATIENT_NAME = "patient_name";
		public static final String GAURDIAN_TYPE = "gaurdian_type";
		public static final String GAURDIAN_NAME = "gaurdian_name";
		public static final String AGE = "age";
		public static final String GENDER = "gender";
		public static final String PATIENT_AADHAR_NO = "patient_aadhar_no";
		public static final String PATIENT_PHONE = "patient_phone";
		public static final String GAURDIAN_PHONE = "gaurdian_phone";
		public static final String ADDRESS1 = "address1";
		public static final String ADDRESS2 = "address2";
		//public static final String SYMPTOMS_LIST="symptoms_list";
		public static final String OTHER_SYMPTOMS="other_symptoms";
		public static final String BLOOD_GROUP = "blood_group";
		public static final String WEIGHT = "weight";
		public static final String HEIGHT = "height";
		public static final String ANY_OTHER_DISEASES = "any_other_disease";
		public static final String COMMENTS = "comments";
		public static final String ADDED_BY = "added_by";
		public static final String ADDED_BY_ID = "added_by_id";


	}

	public static class SessionManager
	{
		public static final String ACCOUNT_SESSION = "my_account_session";
		public static final String FCM_REG_ID = "my_fcm_reg_id";
		public static final String MY_ACCOUNT_TYPE = "my_account_type";
		public static final String MY_USER_NAME = "my_user_name";
		public static final String USER_ID="user_id";
		public static final String MY_PERSON_NAME = "my_person_name";
		public static final String MY_EMPLOYEE_CODE = "my_employee_code";
		public static final String MY_USER_STATE = "my_user_state";
		public static final String MY_USER_DISTT = "my_user_distt";
		public static final String MY_USER_TEHSIL = "my_user_tehsil";
		public static final String MY_USER_VILLAGE = "my_user_village";
		public static final String MY_USER_PINCODE = "my_user_pincode";
		public static final String MY_HOSPITAL_TYPE = "my_hospital_type";
		public static final String MY_HOSPITAL_NAME = "my_hospital_name";
		public static final String MY_USER_PHONE = "my_user_phone";
		public static final String MY_USER_AADHAR_NO = "my_user_aadhar_no";
		public static final String MY_USER_IMAGE = "my_user_image";
	}

	public static class PatientProfile
	{
		public static final String PATIENT_ID="P_Unique_Generated_Id";
		public static final String PATIENT_NAME = "P_Name";
		public static final String CATEGORY_NO = "category_no";
		public static final String CATEGORY_TYPE = "category_type";
		public static final String STATUS = "status";
		public static final String GAURDIAN_TYPE = "P_Guardian_Type";
		public static final String GAURDIAN_NAME = "P_Guardian_Name";
		public static final String IMAGE = "P_image";
		public static final String GENDER = "P_Gender";
		public static final String AGE = "P_Age";
		public static final String PATIENT_AADHAR_NO = "P_Adhar_card_no";
		public static final String PATIENT_PHONE = "P_Phone_no";
		public static final String GAURDIAN_PHONE = "P_Relative_phn_no";
        public static final String P_STATE = "P_State";
        public static final String P_DISTT = "P_District";
        public static final String P_TEHSIL = "P_Tehsil";
		public static final String ADDRESS1 = "P_Address1";
		public static final String ADDRESS2 = "P_Address2";
		//public static final String SYMPTOMS_LIST="P_Current_Symptoms";
        public static final String BLOOD_GROUP="P_Blood_Group";
        public static final String WEIGHT = "P_Weight";
		public static final String HEIGHT = "P_Height";
		public static final String ANY_OTHER_DISEASES = "P_Other_Diseases";
		public static final String COMMENTS = "P_Any_comment";
		public static final String DATE="P_Registration_Date_time";

	}



	public static class EditPatient
	{
		public static final String EDIT_PATIENT_ID="P_Unique_Generated_Id";
		public static final String EDIT_PATIENT_NAME = "P_Name";
		public static final String EDIT_CATEGORY_TYPE = "category_type";
		public static final String EDIT_CATEGORY_NO = "category_no";
		public static final String EDIT_GAURDIAN_TYPE = "P_Guardian_Type";
		public static final String EDIT_GAURDIAN_NAME = "P_Guardian_Name";
		public static final String EDIT_IMAGE = "P_image";
		public static final String EDIT_GENDER = "P_Gender";
		public static final String EDIT_AGE = "P_Age";
		public static final String EDIT_PATIENT_AADHAR_NO = "P_Adhar_card_no";
		public static final String EDIT_PATIENT_PHONE = "P_Phone_no";
		public static final String EDIT_GAURDIAN_PHONE = "P_Relative_phn_no";
		public static final String EDIT_P_STATE = "P_State";
		public static final String EDIT_P_DISTT = "P_District";
		public static final String EDIT_P_TEHSIL = "P_Tehsil";
		public static final String EDIT_ADDRESS1 = "P_Address1";
		public static final String EDIT_ADDRESS2 = "P_Address2";
		public static final String EDIT_BLOOD_GROUP="P_Blood_Group";
		public static final String EDIT_WEIGHT = "P_Weight";
		public static final String EDIT_HEIGHT = "P_Height";
		public static final String EDIT_ANY_OTHER_DISEASES = "P_Other_Diseases";
		public static final String EDIT_COMMENTS = "P_Any_comment";


	}


	public static class EditMedicine
	{
		public static final String EDIT_MEDICINE_ID="med_id";
		public static final String EDIT_MEDICINE_NAME="med_name";
		public static final String EDIT_MEDICINE_STRENGTH="med_strength";
		public static final String EDIT_MEDICINE_UNITS="med_tablets";
		public static final String EDIT_MEDICINE_RUTE="med_rute";
		public static final String EDIT_MEDICINE_FREQUENCY="med_frequency";
		public static final String EDIT_SUN="med_week_sun";
		public static final String EDIT_MON="med_week_mon";
		public static final String EDIT_TUE="med_week_tus";
		public static final String EDIT_WED="med_week_wed";
		public static final String EDIT_THU="med_week_thus";
		public static final String EDIT_FRI="med_week_fri";
		public static final String EDIT_SAT="med_week_sat";
		public static final String EDIT_DOSE_ID="dose_id";
		public static final String EDIT_INSTRUCTION="dose_instructions";
		public static final String EDIT_DOSE_TIME="dose_time";
		public static final String EDIT_START_DATE="med_start_date";
		public static final String EDIT_END_DATE="med_end_date";


	}


	public static class EditSamples{

		public static final String EDIT_SAMPLE_ID="test_id";
		public static final String EDIT_SAMPLE_NAME="test_name";
		public static final String EDIT_SAMPLE_NO="test_sample_no";
		public static final String EDIT_SAMPLE_DESCRIPTION="test_description";
		public static final String EDIT_SAMPLE_INSTRUCTION="test_instructions";





	}


}
