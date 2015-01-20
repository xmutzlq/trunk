package com.honda.displayaudio.system.speech;
/**
 * a callback interface used by VRStatus.
 */
interface IVRStatusCallback
{
	void onStatusUpdated( in boolean enabled, in int icon_status, in int ac_mode, in int mic_mode);
}
