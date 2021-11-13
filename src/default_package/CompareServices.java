package default_package;

import java.util.ArrayList;
import java.util.List;

public class CompareServices {
	String[] defaultServices = {"acpid", "alsa-utils", "anacron", "apparmor", "apport",
			"avahi-daemon", "bluetooth", "clamav-freshclam", "console-setup.sh", "cron", "cups",
			"cups-browsed", "dbus", "gdm3", "grub-common", "hwclock.sh", "  irqbalance",
			"kerneloops", "keyboard-setup.sh", "kmod", "network-manager", "open-vm-tools",
			"openvpn", "plymouth", "plymouth-log", "pppd-dns", "procps",
			"pulseaudio-enable-autospawn", "rsync", "rsyslog", "saned", "speech-dispatcher",
			"spice-vdagent", "udev", "ufw", "unattended-upgrades", "uuidd", "whoopsie",
			"x11-common"};

	public String[] compareMissing(String[] list) {
		ArrayList<String> ar = new ArrayList<String>();
		for (int j = 0; j < defaultServices.length; j++) {
			for (int i = 0; i < list.length; i++) {
				if (defaultServices[j].contains(list[i]) || list[i].contains(defaultServices[j])) {
					break;
				} else if (i == list.length - 1) {
					ar.add(defaultServices[j]);
				}
			}
		}
		String[] stringArray = ar.toArray(new String[0]);
		return stringArray;
	}

	public String[] compareExtra(String[] list) {
		ArrayList<String> ar = new ArrayList<String>();
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < defaultServices.length; j++) {
				if (defaultServices[j].contains(list[i]) || list[i].contains(defaultServices[j])) {
					break;
				} else if (j == defaultServices.length - 1) {
					ar.add(list[i]);
				}
			}
		}
		String[] stringArray = ar.toArray(new String[0]);
		return stringArray;
	}

}
