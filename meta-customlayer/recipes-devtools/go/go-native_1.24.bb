SUMMARY = "The Go programming language compiler (native)"
HOMEPAGE = "https://go.dev"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707"

inherit native go-native

PV = "1.24.0"

GO_TARGET_TOOLS = "go"

SRC_URI = "file://go1.24.0.src.tar.gz"
SRC_URI[sha256sum] = "d14120614acb29d12bcab72bd689f257eb4be9e0b6f88a8fb7e41ac65f8556e5"

