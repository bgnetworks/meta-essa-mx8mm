FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-HAB-encrypted-boot.patch"
SRC_URI += "file://0002-Add-fastboot-commands.patch"
