DESCRIPTION = "A custom minimal image that includes the test-software package."
LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL = "packagegroup-core-boot"

IMAGE_INSTALL:append = " test-software"
