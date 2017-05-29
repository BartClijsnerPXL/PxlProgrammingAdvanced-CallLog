package be.pxl.calllog.service;

import be.pxl.calllog.model.CallLog;
import be.pxl.calllog.model.CallLogStatus;

public interface CallLogService {
	
	public CallLog searchCallLogByName(String name);
	public CallLog searchCallLogByDate(String name);
	public CallLog searchCallLogByCompany(String company);
	public CallLog searchCallLogByState(CallLogStatus state);
	
}
