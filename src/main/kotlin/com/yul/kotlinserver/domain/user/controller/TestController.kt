package com.yul.kotlinserver.domain.user.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.InetAddress
import java.net.NetworkInterface

@RestController
@RequestMapping("/api/test")
class TestController {

    @GetMapping
    fun getIpAdress(): String {
        var ip: InetAddress

        ip = InetAddress.getLocalHost()
        var network: NetworkInterface = NetworkInterface.getByInetAddress(ip)
        var mac: ByteArray = network.hardwareAddress;
        println(mac)
        println()

        var sb: StringBuilder = StringBuilder()


        for (i: Byte in mac) {
            println(i)
            sb.append(String.format("%02X%s", i, "-"))
//            sb.append(String.format("%02X%s", i, if (i < mac.size - 1) "-" else "")) // 하이픈이 안붙는 경우가 생김
        }
        var macAddress: String = sb.substring(0, sb.length-1)

        println(macAddress)

        return ""
    }
}