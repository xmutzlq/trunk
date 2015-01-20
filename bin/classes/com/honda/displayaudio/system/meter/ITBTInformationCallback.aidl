package com.honda.displayaudio.system.meter;
import com.honda.displayaudio.system.meter.ReplyGuideInfo;
/**
 * a callback interface used by TBTInfomationService.
 */
interface ITBTInformationCallback
{
	void onReplyGuideInfo(in ReplyGuideInfo data);
	void onStatusUpdated(int status);
}
