<!--
# File: README.md
# Author: Sivaprasad SV, Jasmin Infotech
# Copyright (c) 2021 BG Networks, Inc. 
#
# See LICENSE file for license details.
-->

<p align="center">
    <img src="docs/assets/BGN_logo.png" alt="BGN_logo" />
</p>
# meta-essa-mx8mm

[BG Network's](https://bgnet.works/) [Embedded Security Software Architecture](https://bgnet.works/embedded-security-software-architecture/) (ESSA), a collection of scripts, recipes, configurations, and documentation for Linux, enhances cybersecurity for IoT devices, including secure boot, encryption and/or authentication. The ESSA enables engineers to extend a hardware root of trust to secure U-Boot, the Linux kernel, and applications in the root file system.

To provide strong cybersecurity without compromising performance or functionality, this architecture leverages:

- In-silicon cryptographic accelerators and secure memory
- Linux security features

The ESSA is Linux based and when used in conjunction with the SAT will support:

- Hardware root of trust extended to the rootfs and software application layer Configuration of Linux Device Mapper (DM) cryptographic functions.
- Use of AES-XTS and HMAC-SHA256 cryptographic algorithms.
- Root of trust extended to Linux userspace.

## Supported board

The following board is the only board tested in this release.

- NXP i.<d/>MX 8M Mini Evaluation Kit (imx8mmevk) - [8MMINILPD4-EVK](https://www.nxp.com/part/8MMINILPD4-EVK#/)

## Quick Start Guide

See the [Quick Start Guide](docs/Quick_Start_Guide.md) for instructions of building core image and for a quick demo of **DM-Crypt with CAAM's black key**.

## Detailed Guide

To know more about the [BG Networks ESSA](https://bgnet.works/download-essa-user-guide/) and its potential capabilities, [contact BG Networks](https://bgnet.works/contact-us).


## Contributing

To contribute to the development of this BSP and/or submit patches for new boards please feel free to [create pull requests](https://github.com/bgnetworks/meta-essa-mx8mm/pulls).

## Maintainer(s)

The author(s) and maintainer(s) of this layer is(are):

- Daniel Selvan D - <daniel.selvan@jasmin-infotech.com> - [danie007](https://github.com/danie007)
- Sivaprasad SV - <sivaprasad.sv@jasmin-infotech.com> - [svsprasad96](https://github.com/svsprasad96)
