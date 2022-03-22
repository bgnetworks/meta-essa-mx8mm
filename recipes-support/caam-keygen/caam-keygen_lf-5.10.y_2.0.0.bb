# Copyright (c) 2022 BG Networks, Inc.
#
# This program is free software; you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published by
# the Free Software Foundation; either version 2 of the License, or
# (at your option) any later version.
#
# Created by Daniel Selvan, Jasmin Infotech
# Updated on 21.03.2022
#

SUMMARY = "User space application used to generate black keys and blobs and copy it to the device"
DESCRIPTION = "CAAM keygen usage: caam-keygen [options] \
Options: \
create <key_name> <key_enc> <key_mode> <key_val> \
 <key_name> the name of the file that will contain the black key. \
 A file with the same name, but with .bb extension, will contain the black blob. \
 <key_enc> can be ecb or ccm \
 <key_mode> can be -s or -t. \
 -s generate a black key from random with the size given in the next argument \
 -t generate a black key from a plaintext given in the next argument \
 <key_val> the size or the plaintext based on the previous argument (<key_mode>) \
import <blob_name> <key_name> \
 <blob_name> the absolute path of the file that contains the blob \
 <key_name> the name of the file that will contain the black key."
HOMEPAGE = "https://source.codeaurora.org/external/imx/keyctl_caam/tree/?h=lf-5.10.y_2.0.0"

LICENSE = "CLOSED"
LIC_FILES_CHKSUM = "file://COPYING;md5=8636bd68fc00cc6a3809b7b58b45f982"

SRC_BRANCH = "lf-5.10.y_2.0.0"
LOCALVERSION = "-2.0.0"
PACKAGE_SRC = "git://source.codeaurora.org/external/imx/keyctl_caam.git;protocol=https"
SRC_URI = "${PACKAGE_SRC};branch=${SRC_BRANCH}"

# As on Mar 21 22
SRCREV = "6b80882e3d5bc986a1f2f9512845170658ba9ea2"

S = "${WORKDIR}/git"

TARGET_CC_ARCH += "${LDFLAGS}"

do_compile () {
	oe_runmake
}

do_install () {
	oe_runmake DESTDIR=${D} install
}
