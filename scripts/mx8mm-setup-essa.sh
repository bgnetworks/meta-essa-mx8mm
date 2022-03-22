# ESSA Integration Setup Script
#
# Copyright 2019 NXP
# Copyright (c) 2021 BG Networks, Inc.
#
# This program is free software; you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published by
# the Free Software Foundation; either version 2 of the License, or
# (at your option) any later version.
# Daniel Selvan D., Jasmin Infotech, 06-2021
#

. imx-setup-release.sh $@

# If NXP script failed, halt
(($? != 0)) && {
    echo "init script failure"
    exit 1
}

echo "" >>conf/bblayers.conf
echo "# ESSA integration layer" >>conf/bblayers.conf
echo "BBLAYERS += \" \${BSPDIR}/sources/meta-essa-mx8mm \"" >>conf/bblayers.conf

cat ../sources/meta-essa-mx8mm/templates/local.conf.append >>conf/local.conf

echo ""
echo "BGN-ESSA integration completed!"
echo ""
echo "try running \"bitbake core-image-base\" (tested build)"
