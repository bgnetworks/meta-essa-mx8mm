# Copyright (c) 2021 BG Networks, Inc.
#
# This program is free software; you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published by
# the Free Software Foundation; either version 2 of the License, or
# (at your option) any later version.
#

SUMMARY = "system initial setup script"
LICENSE = "CLOSED"

SRC_URI = "file://sys_setup.sh"
SRC_URI += "file://zsend.sh"

RDEPENDS_${PN} += "bash"

do_install() {
    # Installing the setup script in /data
    install -d ${D}/data
    install -d ${D}/dmblk
    install -d ${D}/home/root
      
    install -m 0755 ${WORKDIR}/sys_setup.sh ${D}/data/
    install -m 0755 ${WORKDIR}/zsend.sh ${D}/home/root/
}

FILES_${PN} += "/data/sys_setup.sh"
FILES_${PN} += "/home/root/zsend.sh"
FILES_${PN} += "/dmblk/"
