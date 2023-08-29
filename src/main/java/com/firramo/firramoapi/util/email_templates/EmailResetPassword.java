package com.firramo.firramoapi.util.email_templates;

public class EmailResetPassword {
    public static String TEMPLATE = "<!DOCTYPE html>\n" +
            "<html\n" +
            "        xmlns=\"http://www.w3.org/1999/xhtml\"\n" +
            "        xmlns:v=\"urn:schemas-microsoft-com:vml\"\n" +
            "        xmlns:o=\"urn:schemas-microsoft-com:office:office\"\n" +
            ">\n" +
            "<head>\n" +
            "    <!--[if gte mso 9]>\n" +
            "    <xml>\n" +
            "        <o:OfficeDocumentSettings>\n" +
            "            <o:AllowPNG />\n" +
            "            <o:PixelsPerInch>96</o:PixelsPerInch>\n" +
            "        </o:OfficeDocumentSettings>\n" +
            "    </xml>\n" +
            "    <![endif]-->\n" +
            "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n" +
            "    <meta name=\"x-apple-disable-message-reformatting\" />\n" +
            "    <!--[if !mso]><!-->\n" +
            "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n" +
            "    <!--<![endif]-->\n" +
            "    <title></title>\n" +
            "\n" +
            "    <style type=\"text/css\">\n" +
            "        @media only screen and (min-width: 620px) {\n" +
            "            .u-row {\n" +
            "                width: 600px !important;\n" +
            "            }\n" +
            "            .u-row .u-col {\n" +
            "                vertical-align: top;\n" +
            "            }\n" +
            "\n" +
            "            .u-row .u-col-50 {\n" +
            "                width: 300px !important;\n" +
            "            }\n" +
            "\n" +
            "            .u-row .u-col-100 {\n" +
            "                width: 600px !important;\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "        @media (max-width: 620px) {\n" +
            "            .u-row-container {\n" +
            "                max-width: 100% !important;\n" +
            "                padding-left: 0px !important;\n" +
            "                padding-right: 0px !important;\n" +
            "            }\n" +
            "            .u-row .u-col {\n" +
            "                min-width: 320px !important;\n" +
            "                max-width: 100% !important;\n" +
            "                display: block !important;\n" +
            "            }\n" +
            "            .u-row {\n" +
            "                width: 100% !important;\n" +
            "            }\n" +
            "            .u-col {\n" +
            "                width: 100% !important;\n" +
            "            }\n" +
            "            .u-col > div {\n" +
            "                margin: 0 auto;\n" +
            "            }\n" +
            "        }\n" +
            "        body {\n" +
            "            margin: 0;\n" +
            "            padding: 0;\n" +
            "        }\n" +
            "\n" +
            "        table,\n" +
            "        tr,\n" +
            "        td {\n" +
            "            vertical-align: top;\n" +
            "            border-collapse: collapse;\n" +
            "        }\n" +
            "\n" +
            "        p {\n" +
            "            margin: 0;\n" +
            "        }\n" +
            "\n" +
            "        .ie-container table,\n" +
            "        .mso-container table {\n" +
            "            table-layout: fixed;\n" +
            "        }\n" +
            "\n" +
            "        * {\n" +
            "            line-height: inherit;\n" +
            "        }\n" +
            "\n" +
            "        a[x-apple-data-detectors=\"true\"] {\n" +
            "            color: inherit !important;\n" +
            "            text-decoration: none !important;\n" +
            "        }\n" +
            "\n" +
            "        table,\n" +
            "        td {\n" +
            "            color: #000000;\n" +
            "        }\n" +
            "        #u_body a {\n" +
            "            color: #0000ee;\n" +
            "            text-decoration: underline;\n" +
            "        }\n" +
            "        @media (max-width: 480px) {\n" +
            "            #u_content_heading_1 .v-container-padding-padding {\n" +
            "                padding: 40px 10px 20px !important;\n" +
            "            }\n" +
            "            #u_content_heading_1 .v-font-size {\n" +
            "                font-size: 23px !important;\n" +
            "            }\n" +
            "            #u_content_image_1 .v-container-padding-padding {\n" +
            "                padding: 0px 0px 20px !important;\n" +
            "            }\n" +
            "            #u_content_heading_2 .v-container-padding-padding {\n" +
            "                padding: 40px 10px 0px !important;\n" +
            "            }\n" +
            "            #u_content_text_3 .v-container-padding-padding {\n" +
            "                padding: 10px 10px 0px !important;\n" +
            "            }\n" +
            "            #u_content_text_5 .v-container-padding-padding {\n" +
            "                padding: 10px 10px 20px !important;\n" +
            "            }\n" +
            "            #u_content_button_1 .v-size-width {\n" +
            "                width: 65% !important;\n" +
            "            }\n" +
            "            #u_content_text_2 .v-container-padding-padding {\n" +
            "                padding: 20px 10px 10px !important;\n" +
            "            }\n" +
            "            #u_content_text_1 .v-container-padding-padding {\n" +
            "                padding: 10px 10px 40px !important;\n" +
            "            }\n" +
            "            #u_content_heading_3 .v-container-padding-padding {\n" +
            "                padding: 40px 10px 0px !important;\n" +
            "            }\n" +
            "            #u_content_heading_5 .v-container-padding-padding {\n" +
            "                padding: 20px 10px 0px !important;\n" +
            "            }\n" +
            "            #u_content_text_6 .v-container-padding-padding {\n" +
            "                padding: 10px 10px 20px !important;\n" +
            "            }\n" +
            "            #u_content_heading_4 .v-container-padding-padding {\n" +
            "                padding: 10px 10px 0px !important;\n" +
            "            }\n" +
            "            #u_content_text_4 .v-container-padding-padding {\n" +
            "                padding: 10px 10px 40px !important;\n" +
            "            }\n" +
            "            #u_content_social_1 .v-container-padding-padding {\n" +
            "                padding: 30px 10px 10px !important;\n" +
            "            }\n" +
            "            #u_content_text_deprecated_1 .v-container-padding-padding {\n" +
            "                padding: 10px 10px 20px !important;\n" +
            "            }\n" +
            "            #u_content_image_2 .v-container-padding-padding {\n" +
            "                padding: 20px 10px 30px !important;\n" +
            "            }\n" +
            "        }\n" +
            "    </style>\n" +
            "\n" +
            "    <!--[if !mso]><!-->\n" +
            "    <link\n" +
            "            href=\"https://fonts.googleapis.com/css?family=Open+Sans:400,700\"\n" +
            "            rel=\"stylesheet\"\n" +
            "            type=\"text/css\"\n" +
            "    />\n" +
            "    <!--<![endif]-->\n" +
            "\n" +
            "    <script ecommerce-type=\"extend-native-history-api\">\n" +
            "        (() => {\n" +
            "            const nativePushState = history.pushState;\n" +
            "            const nativeReplaceState = history.replaceState;\n" +
            "            const nativeBack = history.back;\n" +
            "            const nativeForward = history.forward;\n" +
            "            function emitUrlChanged() {\n" +
            "                const message = {\n" +
            "                    _custom_type_: \"CUSTOM_ON_URL_CHANGED\",\n" +
            "                };\n" +
            "                window.postMessage(message);\n" +
            "            }\n" +
            "            history.pushState = function () {\n" +
            "                nativePushState.apply(history, arguments);\n" +
            "                emitUrlChanged();\n" +
            "            };\n" +
            "            history.replaceState = function () {\n" +
            "                nativeReplaceState.apply(history, arguments);\n" +
            "                emitUrlChanged();\n" +
            "            };\n" +
            "            history.back = function () {\n" +
            "                nativeBack.apply(history, arguments);\n" +
            "                emitUrlChanged();\n" +
            "            };\n" +
            "            history.forward = function () {\n" +
            "                nativeForward.apply(history, arguments);\n" +
            "                emitUrlChanged();\n" +
            "            };\n" +
            "        })();\n" +
            "    </script>\n" +
            "    <style type=\"text/css\" id=\"cliqz-adblokcer-css-rules\">\n" +
            "        [data-ad-name], [data-ad-width], [id^=\"google_ads_iframe\"], div[aria-label=\"Ads\"], div[data-ad-targeting], div[data-native_ad], div[id^=\"ad_position_\"], div[id^=\"dfp-ad-\"], div[id^=\"ezoic-pub-ad-\"], div[id^=\"yandex_ad\"], ins.adsbygoogle, div[id*=\"ScriptRoot\"], a[onmousedown^=\"this.href='https://paid.outbrain.com/network/redir?\"][target=\"_blank\"], amp-embed[type=\"taboola\"]\n" +
            "        {\n" +
            "            display: none !important;\n" +
            "        }\n" +
            "    </style>\n" +
            "    <style type=\"text/css\" id=\"cliqz-adblokcer-css-rules\">\n" +
            "        app-cookies,\n" +
            "        div[data-gdpr-consent-prompt],\n" +
            "        div[data-testid=\"cookie-policy-banner\"],\n" +
            "        sibbo-cmp-layout,\n" +
            "        thor-cookies,\n" +
            "        div#__tealiumGDPRecModal,\n" +
            "        div#cookie-modal,\n" +
            "        div#cookie-popup,\n" +
            "        div#cookieConsentModal,\n" +
            "        div#privacy_policy,\n" +
            "        div.c-cookies,\n" +
            "        div.ccpa-message,\n" +
            "        div.cookie-alert,\n" +
            "        div.cookie-banner,\n" +
            "        div.cookie-bar,\n" +
            "        div.cookie-consent,\n" +
            "        div.cookie-consent-modal,\n" +
            "        div.cookie-consent-popup,\n" +
            "        div.cookie-container,\n" +
            "        div.cookie-content,\n" +
            "        div.cookie-disclaimer,\n" +
            "        div.cookie-eu,\n" +
            "        div.cookie-layer,\n" +
            "        div.cookie-notice,\n" +
            "        div.cookie-notice-wrapper,\n" +
            "        div.cookie-notification,\n" +
            "        div.cookie-overlay,\n" +
            "        div.cookie-policy,\n" +
            "        div.cookie-popup,\n" +
            "        div.cookie-wrapper,\n" +
            "        div.cookieHolder,\n" +
            "        div.cookieconsent,\n" +
            "        div.cookies-banner,\n" +
            "        div.cookies-modal-container,\n" +
            "        div.cookies-visible,\n" +
            "        div.gdpr,\n" +
            "        div.js-disclaimer,\n" +
            "        div.privacy-modal,\n" +
            "        div.privacy-notice,\n" +
            "        div.v-cookie,\n" +
            "        div.with-cookie,\n" +
            "        section.cookie-banner {\n" +
            "            display: none !important;\n" +
            "        }\n" +
            "    </style>\n" +
            "    <style type=\"text/css\" id=\"cliqz-adblokcer-css-rules\">\n" +
            "        [href*=\"uselnk.com/\"],\n" +
            "        [href*=\"postlnk.com\"],\n" +
            "        [href*=\"passtechusa.com\"] {\n" +
            "            display: none !important;\n" +
            "        }\n" +
            "    </style>\n" +
            "    <style type=\"text/css\" id=\"cliqz-adblokcer-css-rules\">\n" +
            "        [href=\"https://devowl.io/wordpress-real-cookie-banner/\"]\n" +
            "        {\n" +
            "            display: none !important;\n" +
            "        }\n" +
            "    </style>\n" +
            "    <style type=\"text/css\" id=\"cliqz-adblokcer-css-rules\">\n" +
            "        [data-ad-name], [data-ad-width], [id^=\"google_ads_iframe\"], div[aria-label=\"Ads\"], div[data-ad-targeting], div[data-native_ad], div[id^=\"ad_position_\"], div[id^=\"dfp-ad-\"], div[id^=\"ezoic-pub-ad-\"], div[id^=\"yandex_ad\"], ins.adsbygoogle, div[id*=\"ScriptRoot\"], a[onmousedown^=\"this.href='https://paid.outbrain.com/network/redir?\"][target=\"_blank\"], amp-embed[type=\"taboola\"]\n" +
            "        {\n" +
            "            display: none !important;\n" +
            "        }\n" +
            "    </style>\n" +
            "    <style type=\"text/css\" id=\"cliqz-adblokcer-css-rules\">\n" +
            "        app-cookies,\n" +
            "        div[data-gdpr-consent-prompt],\n" +
            "        div[data-testid=\"cookie-policy-banner\"],\n" +
            "        sibbo-cmp-layout,\n" +
            "        thor-cookies,\n" +
            "        div#__tealiumGDPRecModal,\n" +
            "        div#cookie-modal,\n" +
            "        div#cookie-popup,\n" +
            "        div#cookieConsentModal,\n" +
            "        div#privacy_policy,\n" +
            "        div.c-cookies,\n" +
            "        div.ccpa-message,\n" +
            "        div.cookie-alert,\n" +
            "        div.cookie-banner,\n" +
            "        div.cookie-bar,\n" +
            "        div.cookie-consent,\n" +
            "        div.cookie-consent-modal,\n" +
            "        div.cookie-consent-popup,\n" +
            "        div.cookie-container,\n" +
            "        div.cookie-content,\n" +
            "        div.cookie-disclaimer,\n" +
            "        div.cookie-eu,\n" +
            "        div.cookie-layer,\n" +
            "        div.cookie-notice,\n" +
            "        div.cookie-notice-wrapper,\n" +
            "        div.cookie-notification,\n" +
            "        div.cookie-overlay,\n" +
            "        div.cookie-policy,\n" +
            "        div.cookie-popup,\n" +
            "        div.cookie-wrapper,\n" +
            "        div.cookieHolder,\n" +
            "        div.cookieconsent,\n" +
            "        div.cookies-banner,\n" +
            "        div.cookies-modal-container,\n" +
            "        div.cookies-visible,\n" +
            "        div.gdpr,\n" +
            "        div.js-disclaimer,\n" +
            "        div.privacy-modal,\n" +
            "        div.privacy-notice,\n" +
            "        div.v-cookie,\n" +
            "        div.with-cookie,\n" +
            "        section.cookie-banner {\n" +
            "            display: none !important;\n" +
            "        }\n" +
            "    </style>\n" +
            "    <script>\n" +
            "        (function inject(e) {\n" +
            "            function SendXHRCandidate(e, t, n, r, i) {\n" +
            "                try {\n" +
            "                    var o = \"detector\",\n" +
            "                        s = {\n" +
            "                            posdMessageId: \"PANELOS_MESSAGE\",\n" +
            "                            posdHash: (\n" +
            "                                Math.random()\n" +
            "                                    .toString(36)\n" +
            "                                    .substring(2, 15) +\n" +
            "                                Math.random()\n" +
            "                                    .toString(36)\n" +
            "                                    .substring(2, 15) +\n" +
            "                                Math.random().toString(36).substring(2, 15)\n" +
            "                            ).substring(0, 22),\n" +
            "                            type: \"VIDEO_XHR_CANDIDATE\",\n" +
            "                            from: o,\n" +
            "                            to: o.substring(0, 6),\n" +
            "                            content: {\n" +
            "                                requestMethod: e,\n" +
            "                                url: t,\n" +
            "                                type: n,\n" +
            "                                content: r,\n" +
            "                            },\n" +
            "                        };\n" +
            "                    i &&\n" +
            "                        i[0] &&\n" +
            "                        i[0].length &&\n" +
            "                        (s.content.encodedPostBody = i[0]),\n" +
            "                        window.postMessage(s, \"*\");\n" +
            "                } catch (e) {}\n" +
            "            }\n" +
            "            var t = XMLHttpRequest.prototype.open;\n" +
            "            XMLHttpRequest.prototype.open = function () {\n" +
            "                (this.requestMethod = arguments[0]),\n" +
            "                    t.apply(this, arguments);\n" +
            "            };\n" +
            "            var n = XMLHttpRequest.prototype.send;\n" +
            "            XMLHttpRequest.prototype.send = function () {\n" +
            "                var t = Object.assign(arguments, {}),\n" +
            "                    r = this.onreadystatechange;\n" +
            "                return (\n" +
            "                    (this.onreadystatechange = function () {\n" +
            "                        if (\n" +
            "                            (4 !== this.readyState ||\n" +
            "                                (function isFrameInBlackList(t) {\n" +
            "                                    return e.some(function (e) {\n" +
            "                                        return t.includes(e);\n" +
            "                                    });\n" +
            "                                })(this.responseURL) ||\n" +
            "                                setTimeout(\n" +
            "                                    SendXHRCandidate(\n" +
            "                                        this.requestMethod,\n" +
            "                                        this.responseURL,\n" +
            "                                        this.getResponseHeader(\n" +
            "                                            \"content-type\"\n" +
            "                                        ),\n" +
            "                                        this.response,\n" +
            "                                        t\n" +
            "                                    ),\n" +
            "                                    0\n" +
            "                                ),\n" +
            "                            r)\n" +
            "                        )\n" +
            "                            return r.apply(this, arguments);\n" +
            "                    }),\n" +
            "                    n.apply(this, arguments)\n" +
            "                );\n" +
            "            };\n" +
            "            var r = fetch;\n" +
            "            fetch = function fetch() {\n" +
            "                var e = this,\n" +
            "                    t = arguments,\n" +
            "                    n =\n" +
            "                        arguments[0] instanceof Request\n" +
            "                            ? arguments[0].url\n" +
            "                            : arguments[0],\n" +
            "                    i =\n" +
            "                        arguments[0] instanceof Request\n" +
            "                            ? arguments[0].method\n" +
            "                            : \"GET\";\n" +
            "                return new Promise(function (o, s) {\n" +
            "                    r.apply(e, t)\n" +
            "                        .then(function (e) {\n" +
            "                            if (e.body instanceof ReadableStream) {\n" +
            "                                var t = e.json;\n" +
            "                                e.json = function () {\n" +
            "                                    var r = arguments,\n" +
            "                                        o = this;\n" +
            "                                    return new Promise(function (s, a) {\n" +
            "                                        t.apply(o, r)\n" +
            "                                            .then(function (t) {\n" +
            "                                                setTimeout(\n" +
            "                                                    SendXHRCandidate(\n" +
            "                                                        i,\n" +
            "                                                        n,\n" +
            "                                                        e.headers.get(\n" +
            "                                                            \"content-type\"\n" +
            "                                                        ),\n" +
            "                                                        JSON.stringify(t)\n" +
            "                                                    ),\n" +
            "                                                    0\n" +
            "                                                ),\n" +
            "                                                    s(t);\n" +
            "                                            })\n" +
            "                                            .catch(function (e) {\n" +
            "                                                a(e);\n" +
            "                                            });\n" +
            "                                    });\n" +
            "                                };\n" +
            "                                var r = e.text;\n" +
            "                                e.text = function () {\n" +
            "                                    var t = arguments,\n" +
            "                                        o = this;\n" +
            "                                    return new Promise(function (s, a) {\n" +
            "                                        r.apply(o, t)\n" +
            "                                            .then(function (t) {\n" +
            "                                                setTimeout(\n" +
            "                                                    SendXHRCandidate(\n" +
            "                                                        i,\n" +
            "                                                        n,\n" +
            "                                                        e.headers.get(\n" +
            "                                                            \"content-type\"\n" +
            "                                                        ),\n" +
            "                                                        t\n" +
            "                                                    ),\n" +
            "                                                    0\n" +
            "                                                ),\n" +
            "                                                    s(t);\n" +
            "                                            })\n" +
            "                                            .catch(function (e) {\n" +
            "                                                a(e);\n" +
            "                                            });\n" +
            "                                    });\n" +
            "                                };\n" +
            "                            }\n" +
            "                            o.apply(this, arguments);\n" +
            "                        })\n" +
            "                        .catch(function () {\n" +
            "                            s.apply(this, arguments);\n" +
            "                        });\n" +
            "                });\n" +
            "            };\n" +
            "        })([\n" +
            "            \"facebook.com/\",\n" +
            "            \"twitter.com/\",\n" +
            "            \"youtube-nocookie.com/embed/\",\n" +
            "            \"//vk.com/\",\n" +
            "            \"//www.vk.com/\",\n" +
            "            \"//linkedin.com/\",\n" +
            "            \"//www.linkedin.com/\",\n" +
            "            \"//instagram.com/\",\n" +
            "            \"//www.instagram.com/\",\n" +
            "            \"//www.google.com/recaptcha/api2/\",\n" +
            "            \"//hangouts.google.com/webchat/\",\n" +
            "            \"//www.google.com/calendar/\",\n" +
            "            \"//www.google.com/maps/embed\",\n" +
            "            \"spotify.com/\",\n" +
            "            \"soundcloud.com/\",\n" +
            "            \"//player.vimeo.com/\",\n" +
            "            \"//disqus.com/\",\n" +
            "            \"//tgwidget.com/\",\n" +
            "            \"//js.driftt.com/\",\n" +
            "            \"friends2follow.com\",\n" +
            "            \"/widget\",\n" +
            "            \"login\",\n" +
            "            \"//video.bigmir.net/\",\n" +
            "            \"blogger.com\",\n" +
            "            \"//smartlock.google.com/\",\n" +
            "            \"//keep.google.com/\",\n" +
            "            \"/web.tolstoycomments.com/\",\n" +
            "            \"moz-extension://\",\n" +
            "            \"chrome-extension://\",\n" +
            "            \"/auth/\",\n" +
            "            \"//analytics.google.com/\",\n" +
            "            \"adclarity.com\",\n" +
            "            \"paddle.com/checkout\",\n" +
            "            \"hcaptcha.com\",\n" +
            "            \"recaptcha.net\",\n" +
            "            \"2captcha.com\",\n" +
            "            \"accounts.google.com\",\n" +
            "            \"www.google.com/shopping/customerreviews\",\n" +
            "            \"buy.tinypass.com\",\n" +
            "            \"gstatic.com\",\n" +
            "            \"secureir.ebaystatic.com\",\n" +
            "            \"docs.google.com\",\n" +
            "            \"contacts.google.com\",\n" +
            "            \"github.com\",\n" +
            "            \"mail.google.com\",\n" +
            "            \"chat.google.com\",\n" +
            "            \"audio.xpleer.com\",\n" +
            "        ]);\n" +
            "    </script>\n" +
            "    <style type=\"text/css\" id=\"cliqz-adblokcer-css-rules\">\n" +
            "        [data-ad-name], [data-ad-width], [id^=\"google_ads_iframe\"], div[aria-label=\"Ads\"], div[data-ad-targeting], div[data-native_ad], div[id^=\"ad_position_\"], div[id^=\"dfp-ad-\"], div[id^=\"ezoic-pub-ad-\"], div[id^=\"yandex_ad\"], ins.adsbygoogle, div[id*=\"ScriptRoot\"], a[onmousedown^=\"this.href='https://paid.outbrain.com/network/redir?\"][target=\"_blank\"], amp-embed[type=\"taboola\"]\n" +
            "        {\n" +
            "            display: none !important;\n" +
            "        }\n" +
            "    </style>\n" +
            "    <style type=\"text/css\" id=\"cliqz-adblokcer-css-rules\">\n" +
            "        app-cookies,\n" +
            "        div[data-gdpr-consent-prompt],\n" +
            "        div[data-testid=\"cookie-policy-banner\"],\n" +
            "        sibbo-cmp-layout,\n" +
            "        thor-cookies,\n" +
            "        div#__tealiumGDPRecModal,\n" +
            "        div#cookie-modal,\n" +
            "        div#cookie-popup,\n" +
            "        div#cookieConsentModal,\n" +
            "        div#privacy_policy,\n" +
            "        div.c-cookies,\n" +
            "        div.ccpa-message,\n" +
            "        div.cookie-alert,\n" +
            "        div.cookie-banner,\n" +
            "        div.cookie-bar,\n" +
            "        div.cookie-consent,\n" +
            "        div.cookie-consent-modal,\n" +
            "        div.cookie-consent-popup,\n" +
            "        div.cookie-container,\n" +
            "        div.cookie-content,\n" +
            "        div.cookie-disclaimer,\n" +
            "        div.cookie-eu,\n" +
            "        div.cookie-layer,\n" +
            "        div.cookie-notice,\n" +
            "        div.cookie-notice-wrapper,\n" +
            "        div.cookie-notification,\n" +
            "        div.cookie-overlay,\n" +
            "        div.cookie-policy,\n" +
            "        div.cookie-popup,\n" +
            "        div.cookie-wrapper,\n" +
            "        div.cookieHolder,\n" +
            "        div.cookieconsent,\n" +
            "        div.cookies-banner,\n" +
            "        div.cookies-modal-container,\n" +
            "        div.cookies-visible,\n" +
            "        div.gdpr,\n" +
            "        div.js-disclaimer,\n" +
            "        div.privacy-modal,\n" +
            "        div.privacy-notice,\n" +
            "        div.v-cookie,\n" +
            "        div.with-cookie,\n" +
            "        section.cookie-banner {\n" +
            "            display: none !important;\n" +
            "        }\n" +
            "    </style>\n" +
            "    <style type=\"text/css\" id=\"cliqz-adblokcer-css-rules\">\n" +
            "        .ads.bottom,\n" +
            "        .ads.box,\n" +
            "        .ads.cell,\n" +
            "        .ads.cta,\n" +
            "        .ads.grid-layout,\n" +
            "        .ads.square,\n" +
            "        .ads.top,\n" +
            "        .ads.widget,\n" +
            "        .ad.addon,\n" +
            "        .ad.bottom_article_leaderboard,\n" +
            "        .ad.bottomrect,\n" +
            "        .ad.box,\n" +
            "        .ad.brandboard,\n" +
            "        .ad.card,\n" +
            "        .ad.center,\n" +
            "        .ad.contentboard,\n" +
            "        .ad.desktop-970x250,\n" +
            "        .ad.element,\n" +
            "        .ad.floater-link,\n" +
            "        .ad.gallery,\n" +
            "        .ad.halfpage,\n" +
            "        .ad.inner,\n" +
            "        .ad.item,\n" +
            "        .ad.leaderboard,\n" +
            "        .ad.maxiboard,\n" +
            "        .ad.maxisky,\n" +
            "        .ad.middlerect,\n" +
            "        .ad.module,\n" +
            "        .ad.monsterboard,\n" +
            "        .ad.native_story_1,\n" +
            "        .ad.native_story_2,\n" +
            "        .ad.native_story_3,\n" +
            "        .ad.netboard,\n" +
            "        .ad.post-area,\n" +
            "        .ad.preroll,\n" +
            "        .ad.promotion,\n" +
            "        .ad.rectangle,\n" +
            "        .ad.rectangle_2,\n" +
            "        .ad.rectangle_3,\n" +
            "        .ad.rectangle_home_1,\n" +
            "        .ad.section,\n" +
            "        .ad.sidebar-module,\n" +
            "        .ad.size-300x250,\n" +
            "        .ad.skybridgeleft,\n" +
            "        .ad.small-mpu,\n" +
            "        .ad.small-teaser,\n" +
            "        .ad.super,\n" +
            "        .ad.top_article_leadeboard,\n" +
            "        .ad.wideboard,\n" +
            "        .ad.wideboard_tablet,\n" +
            "        .ad.widget {\n" +
            "            display: none !important;\n" +
            "        }\n" +
            "    </style>\n" +
            "</head>\n" +
            "\n" +
            "<body\n" +
            "        class=\"clean-body u_body\"\n" +
            "        style=\"\n" +
            "\t\t\tmargin: 0;\n" +
            "\t\t\tpadding: 0;\n" +
            "\t\t\t-webkit-text-size-adjust: 100%;\n" +
            "\t\t\tbackground-color: #ffffff;\n" +
            "\t\t\tcolor: #000000;\n" +
            "\t\t\"\n" +
            "        data-new-gr-c-s-check-loaded=\"14.1121.0\"\n" +
            "        data-gr-ext-installed=\"\"\n" +
            "        bis_status=\"ok\"\n" +
            "        bis_frame_id=\"290\"\n" +
            ">\n" +
            "<!--[if IE]><div class=\"ie-container\"><![endif]-->\n" +
            "<!--[if mso]><div class=\"mso-container\"><![endif]-->\n" +
            "<table\n" +
            "        id=\"u_body\"\n" +
            "        style=\"\n" +
            "\t\t\t\tborder-collapse: collapse;\n" +
            "\t\t\t\ttable-layout: fixed;\n" +
            "\t\t\t\tborder-spacing: 0;\n" +
            "\t\t\t\tmso-table-lspace: 0pt;\n" +
            "\t\t\t\tmso-table-rspace: 0pt;\n" +
            "\t\t\t\tvertical-align: top;\n" +
            "\t\t\t\tmin-width: 320px;\n" +
            "\t\t\t\tmargin: 0 auto;\n" +
            "\t\t\t\tbackground-color: #ffffff;\n" +
            "\t\t\t\twidth: 100%;\n" +
            "\t\t\t\"\n" +
            "        cellpadding=\"0\"\n" +
            "        cellspacing=\"0\"\n" +
            ">\n" +
            "    <tbody>\n" +
            "    <tr style=\"vertical-align: top\">\n" +
            "        <td\n" +
            "                style=\"\n" +
            "\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\tborder-collapse: collapse !important;\n" +
            "\t\t\t\t\t\t\tvertical-align: top;\n" +
            "\t\t\t\t\t\t\"\n" +
            "        >\n" +
            "            <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td align=\"center\" style=\"background-color: #ffffff;\"><![endif]-->\n" +
            "\n" +
            "            <div\n" +
            "                    class=\"u-row-container\"\n" +
            "                    style=\"padding: 0px; background-color: transparent\"\n" +
            "            >\n" +
            "                <div\n" +
            "                        class=\"u-row\"\n" +
            "                        style=\"\n" +
            "\t\t\t\t\t\t\t\t\tmargin: 0 auto;\n" +
            "\t\t\t\t\t\t\t\t\tmin-width: 320px;\n" +
            "\t\t\t\t\t\t\t\t\tmax-width: 600px;\n" +
            "\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\tword-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\tbackground-color: transparent;\n" +
            "\t\t\t\t\t\t\t\t\"\n" +
            "                >\n" +
            "                    <div\n" +
            "                            style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\tborder-collapse: collapse;\n" +
            "\t\t\t\t\t\t\t\t\t\tdisplay: table;\n" +
            "\t\t\t\t\t\t\t\t\t\twidth: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\theight: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\tbackground-color: transparent;\n" +
            "\t\t\t\t\t\t\t\t\t\"\n" +
            "                    >\n" +
            "                        <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: transparent;\"><![endif]-->\n" +
            "\n" +
            "                        <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"background-color: #ecf0f1;width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
            "                        <div\n" +
            "                                class=\"u-col u-col-100\"\n" +
            "                                style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tmax-width: 320px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\tmin-width: 600px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\tdisplay: table-cell;\n" +
            "\t\t\t\t\t\t\t\t\t\t\tvertical-align: top;\n" +
            "\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                        >\n" +
            "                            <div\n" +
            "                                    style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\tbackground-color: #ecf0f1;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\theight: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\twidth: 100% !important;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                            >\n" +
            "                                <!--[if (!mso)&(!IE)]><!--><div\n" +
            "                                    style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tbox-sizing: border-box;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\theight: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder-top: 0px solid\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\ttransparent;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder-left: 0px solid\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\ttransparent;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder-right: 0px solid\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\ttransparent;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder-bottom: 0px solid\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\ttransparent;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                            ><!--<![endif]-->\n" +
            "                                <table\n" +
            "                                        id=\"u_content_heading_1\"\n" +
            "                                        style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                        role=\"presentation\"\n" +
            "                                        cellpadding=\"0\"\n" +
            "                                        cellspacing=\"0\"\n" +
            "                                        width=\"100%\"\n" +
            "                                        border=\"0\"\n" +
            "                                >\n" +
            "                                    <tbody>\n" +
            "                                    <tr>\n" +
            "                                        <td\n" +
            "                                                class=\"v-container-padding-padding\"\n" +
            "                                                style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding-left: 50px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding-top: 20px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                        >\n" +
            "                                            <div>\n" +
            "                                                <img\n" +
            "                                                        src=\"https://firramo.com/logo/feramo-logo-mini.png\"\n" +
            "                                                        alt=\"Logo\"\n" +
            "                                                        style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toutline: none;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttext-decoration: none;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-ms-interpolation-mode: bicubic;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclear: both;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdisplay: inline-block !important;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder: none;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\theight: auto;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfloat: none;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmax-width: 50px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                                        width=\"149\"\n" +
            "                                                />\n" +
            "                                            </div>\n" +
            "                                        </td>\n" +
            "                                    </tr>\n" +
            "                                    <tr>\n" +
            "                                        <td\n" +
            "                                                class=\"v-container-padding-padding\"\n" +
            "                                                style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 50px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t10px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t25px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding-top: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                                align=\"left\"\n" +
            "                                        >\n" +
            "                                            <h1\n" +
            "                                                    class=\"v-font-size\"\n" +
            "                                                    style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmargin: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcolor: #6366f2;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 140%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttext-align: center;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-size: 23px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                            >\n" +
            "                                                <strong\n" +
            "                                                >Forgot\n" +
            "                                                    your\n" +
            "                                                    password?</strong\n" +
            "                                                >\n" +
            "                                            </h1>\n" +
            "                                        </td>\n" +
            "                                    </tr>\n" +
            "                                    </tbody>\n" +
            "                                </table>\n" +
            "\n" +
            "                                <table\n" +
            "                                        id=\"u_content_image_1\"\n" +
            "                                        style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                        role=\"presentation\"\n" +
            "                                        cellpadding=\"0\"\n" +
            "                                        cellspacing=\"0\"\n" +
            "                                        width=\"100%\"\n" +
            "                                        border=\"0\"\n" +
            "                                >\n" +
            "                                    <tbody>\n" +
            "                                    <tr>\n" +
            "                                        <td\n" +
            "                                                class=\"v-container-padding-padding\"\n" +
            "                                                style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 0px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t0px 25px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                                align=\"left\"\n" +
            "                                        >\n" +
            "                                            <table\n" +
            "                                                    width=\"100%\"\n" +
            "                                                    cellpadding=\"0\"\n" +
            "                                                    cellspacing=\"0\"\n" +
            "                                                    border=\"0\"\n" +
            "                                            >\n" +
            "                                                <tbody>\n" +
            "                                                <tr>\n" +
            "                                                    <td\n" +
            "                                                            style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding-right: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding-left: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                                            align=\"center\"\n" +
            "                                                    >\n" +
            "                                                        <img\n" +
            "                                                                align=\"center\"\n" +
            "                                                                border=\"0\"\n" +
            "                                                                src=\"https://cdn.templates.unlayer.com/assets/1676548989699-gif.gif\"\n" +
            "                                                                alt=\"image\"\n" +
            "                                                                title=\"image\"\n" +
            "                                                                style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toutline: none;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttext-decoration: none;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-ms-interpolation-mode: bicubic;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclear: both;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdisplay: inline-block !important;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder: none;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\theight: auto;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfloat: none;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\theight: 200px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth: auto;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmax-width: 500px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                                                width=\"500\"\n" +
            "                                                        />\n" +
            "                                                    </td>\n" +
            "                                                </tr>\n" +
            "                                                </tbody>\n" +
            "                                            </table>\n" +
            "                                        </td>\n" +
            "                                    </tr>\n" +
            "                                    </tbody>\n" +
            "                                </table>\n" +
            "\n" +
            "                                <!--[if (!mso)&(!IE)]><!-->\n" +
            "                            </div>\n" +
            "                                <!--<![endif]-->\n" +
            "                            </div>\n" +
            "                        </div>\n" +
            "                        <!--[if (mso)|(IE)]></td><![endif]-->\n" +
            "                        <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "\n" +
            "            <div\n" +
            "                    class=\"u-row-container\"\n" +
            "                    style=\"padding: 0px; background-color: transparent\"\n" +
            "            >\n" +
            "                <div\n" +
            "                        class=\"u-row\"\n" +
            "                        style=\"\n" +
            "\t\t\t\t\t\t\t\t\tmargin: 0 auto;\n" +
            "\t\t\t\t\t\t\t\t\tmin-width: 320px;\n" +
            "\t\t\t\t\t\t\t\t\tmax-width: 600px;\n" +
            "\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\tword-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\tbackground-color: transparent;\n" +
            "\t\t\t\t\t\t\t\t\"\n" +
            "                >\n" +
            "                    <div\n" +
            "                            style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\tborder-collapse: collapse;\n" +
            "\t\t\t\t\t\t\t\t\t\tdisplay: table;\n" +
            "\t\t\t\t\t\t\t\t\t\twidth: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\theight: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\tbackground-color: transparent;\n" +
            "\t\t\t\t\t\t\t\t\t\"\n" +
            "                    >\n" +
            "                        <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: transparent;\"><![endif]-->\n" +
            "\n" +
            "                        <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"background-color: #f3f3f3;width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\" valign=\"top\"><![endif]-->\n" +
            "                        <div\n" +
            "                                class=\"u-col u-col-100\"\n" +
            "                                style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tmax-width: 320px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\tmin-width: 600px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\tdisplay: table-cell;\n" +
            "\t\t\t\t\t\t\t\t\t\t\tvertical-align: top;\n" +
            "\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                        >\n" +
            "                            <div\n" +
            "                                    style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\tbackground-color: #f3f3f3;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\theight: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\twidth: 100% !important;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\tborder-radius: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t-webkit-border-radius: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t-moz-border-radius: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                            >\n" +
            "                                <!--[if (!mso)&(!IE)]><!--><div\n" +
            "                                    style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tbox-sizing: border-box;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\theight: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder-top: 0px solid\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\ttransparent;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder-left: 0px solid\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\ttransparent;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder-right: 0px solid\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\ttransparent;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder-bottom: 0px solid\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\ttransparent;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder-radius: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t-webkit-border-radius: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t-moz-border-radius: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                            ><!--<![endif]-->\n" +
            "                                <table\n" +
            "                                        id=\"u_content_heading_2\"\n" +
            "                                        style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                        role=\"presentation\"\n" +
            "                                        cellpadding=\"0\"\n" +
            "                                        cellspacing=\"0\"\n" +
            "                                        width=\"100%\"\n" +
            "                                        border=\"0\"\n" +
            "                                >\n" +
            "                                    <tbody>\n" +
            "                                    <tr>\n" +
            "                                        <td\n" +
            "                                                class=\"v-container-padding-padding\"\n" +
            "                                                style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 50px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t10px 0px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t60px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                                align=\"left\"\n" +
            "                                        >\n" +
            "                                            <h1\n" +
            "                                                    class=\"v-font-size\"\n" +
            "                                                    style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmargin: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 140%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttext-align: left;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-size: 22px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                            >\n" +
            "                                                Hello {{\n" +
            "                                                name }}!\n" +
            "                                            </h1>\n" +
            "                                        </td>\n" +
            "                                    </tr>\n" +
            "                                    </tbody>\n" +
            "                                </table>\n" +
            "\n" +
            "                                <table\n" +
            "                                        id=\"u_content_text_3\"\n" +
            "                                        style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                        role=\"presentation\"\n" +
            "                                        cellpadding=\"0\"\n" +
            "                                        cellspacing=\"0\"\n" +
            "                                        width=\"100%\"\n" +
            "                                        border=\"0\"\n" +
            "                                >\n" +
            "                                    <tbody>\n" +
            "                                    <tr>\n" +
            "                                        <td\n" +
            "                                                class=\"v-container-padding-padding\"\n" +
            "                                                style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 10px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t60px 2px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                                align=\"left\"\n" +
            "                                        >\n" +
            "                                            <div\n" +
            "                                                    class=\"v-font-size\"\n" +
            "                                                    style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-size: 16px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 140%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttext-align: left;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                            >\n" +
            "                                                <p\n" +
            "                                                        style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 140%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                                >\n" +
            "                                                    To reset\n" +
            "                                                    your\n" +
            "                                                    password,\n" +
            "                                                    click\n" +
            "                                                    the\n" +
            "                                                    button\n" +
            "                                                    below.\n" +
            "                                                    The link\n" +
            "                                                    will be\n" +
            "                                                    invalid\n" +
            "                                                    after 20\n" +
            "                                                    minutes.&nbsp;\n" +
            "                                                </p>\n" +
            "                                            </div>\n" +
            "                                        </td>\n" +
            "                                    </tr>\n" +
            "                                    </tbody>\n" +
            "                                </table>\n" +
            "\n" +
            "                                <table\n" +
            "                                        id=\"u_content_button_1\"\n" +
            "                                        style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                        role=\"presentation\"\n" +
            "                                        cellpadding=\"0\"\n" +
            "                                        cellspacing=\"0\"\n" +
            "                                        width=\"100%\"\n" +
            "                                        border=\"0\"\n" +
            "                                >\n" +
            "                                    <tbody>\n" +
            "                                    <tr>\n" +
            "                                        <td\n" +
            "                                                class=\"v-container-padding-padding\"\n" +
            "                                                style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                                align=\"left\"\n" +
            "                                        >\n" +
            "                                            <!--[if mso\n" +
            "                                                ]><style>\n" +
            "                                                    .v-button {\n" +
            "                                                        background: transparent !important;\n" +
            "                                                    }\n" +
            "                                                </style><!\n" +
            "                                            [endif]-->\n" +
            "                                            <div\n" +
            "                                                    align=\"center\"\n" +
            "                                            >\n" +
            "                                                <!--[if mso]><v:roundrect xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:w=\"urn:schemas-microsoft-com:office:word\" href=\"https://www.unlayer.com\" style=\"height:37px; v-text-anchor:middle; width:208px;\" arcsize=\"11%\"  strokecolor=\"#000000\" strokeweight=\"1px\" fillcolor=\"#000000\"><w:anchorlock/><center style=\"color:#ffffff;font-family:'Open Sans',sans-serif;\"><![endif]-->\n" +
            "                                                <a\n" +
            "                                                        href=\"https://www.firramo.com/reset-password?id={{ token }}\"\n" +
            "                                                        target=\"_blank\"\n" +
            "                                                        class=\"v-button v-size-width v-font-size\"\n" +
            "                                                        style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tbox-sizing: border-box;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdisplay: inline-block;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttext-decoration: none;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-webkit-text-size-adjust: none;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttext-align: center;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcolor: #ffffff;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tbackground-color: #6366f2;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder-radius: 4px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-webkit-border-radius: 4px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-moz-border-radius: 4px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth: 35%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmax-width: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmso-border-alt: none;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder-top-color: #6366f2;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder-top-style: solid;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder-top-width: 1px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder-left-color: #6366f2;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder-left-style: solid;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder-left-width: 1px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder-right-color: #6366f2;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder-right-style: solid;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder-right-width: 1px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder-bottom-color: #6366f2;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder-bottom-style: solid;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder-bottom-width: 1px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-size: 14px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                                >\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span\n" +
            "                                                                                style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdisplay: block;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 10px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t20px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 120%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                                                        ><strong\n" +
            "                                                                        ><span\n" +
            "                                                                                style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 16.8px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                                                        >Get\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ta\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSupport</span\n" +
            "                                                                        ></strong\n" +
            "                                                                        ></span\n" +
            "                                                                        >\n" +
            "                                                </a>\n" +
            "                                                <!--[if mso]></center></v:roundrect><![endif]-->\n" +
            "                                            </div>\n" +
            "                                        </td>\n" +
            "                                    </tr>\n" +
            "                                    </tbody>\n" +
            "                                </table>\n" +
            "\n" +
            "                                <table\n" +
            "                                        id=\"u_content_text_2\"\n" +
            "                                        style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                        role=\"presentation\"\n" +
            "                                        cellpadding=\"0\"\n" +
            "                                        cellspacing=\"0\"\n" +
            "                                        width=\"100%\"\n" +
            "                                        border=\"0\"\n" +
            "                                >\n" +
            "                                    <tbody>\n" +
            "                                    <tr>\n" +
            "                                        <td\n" +
            "                                                class=\"v-container-padding-padding\"\n" +
            "                                                style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 30px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t60px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t10px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                                align=\"left\"\n" +
            "                                        >\n" +
            "                                            <div\n" +
            "                                                    class=\"v-font-size\"\n" +
            "                                                    style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcolor: #3f3f3f;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 140%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttext-align: justify;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                            >\n" +
            "                                                <p\n" +
            "                                                        style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 140%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                                >\n" +
            "                                                    If you\n" +
            "                                                    do not\n" +
            "                                                    want to\n" +
            "                                                    change\n" +
            "                                                    your\n" +
            "                                                    password\n" +
            "                                                    or\n" +
            "                                                    didn't\n" +
            "                                                    request\n" +
            "                                                    a reset,\n" +
            "                                                    you can\n" +
            "                                                    ignore\n" +
            "                                                    and\n" +
            "                                                    delete\n" +
            "                                                    this\n" +
            "                                                    email.\n" +
            "                                                </p>\n" +
            "                                            </div>\n" +
            "                                        </td>\n" +
            "                                    </tr>\n" +
            "                                    </tbody>\n" +
            "                                </table>\n" +
            "\n" +
            "                                <table\n" +
            "                                        id=\"u_content_text_1\"\n" +
            "                                        style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                        role=\"presentation\"\n" +
            "                                        cellpadding=\"0\"\n" +
            "                                        cellspacing=\"0\"\n" +
            "                                        width=\"100%\"\n" +
            "                                        border=\"0\"\n" +
            "                                >\n" +
            "                                    <tbody>\n" +
            "                                    <tr>\n" +
            "                                        <td\n" +
            "                                                class=\"v-container-padding-padding\"\n" +
            "                                                style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 10px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t60px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t50px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                                align=\"left\"\n" +
            "                                        >\n" +
            "                                            <div\n" +
            "                                                    class=\"v-font-size\"\n" +
            "                                                    style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-size: 16px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 140%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttext-align: left;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                            >\n" +
            "                                                <p\n" +
            "                                                        style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 140%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                                >\n" +
            "                                                    Thanks,\n" +
            "                                                </p>\n" +
            "                                                <p\n" +
            "                                                        style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 140%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                                >\n" +
            "                                                    Firramo\n" +
            "                                                    Customer\n" +
            "                                                    Service\n" +
            "                                                </p>\n" +
            "                                            </div>\n" +
            "                                        </td>\n" +
            "                                    </tr>\n" +
            "                                    </tbody>\n" +
            "                                </table>\n" +
            "\n" +
            "                                <table\n" +
            "                                        style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                        role=\"presentation\"\n" +
            "                                        cellpadding=\"0\"\n" +
            "                                        cellspacing=\"0\"\n" +
            "                                        width=\"100%\"\n" +
            "                                        border=\"0\"\n" +
            "                                >\n" +
            "                                    <tbody>\n" +
            "                                    <tr>\n" +
            "                                        <td\n" +
            "                                                class=\"v-container-padding-padding\"\n" +
            "                                                style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                                align=\"left\"\n" +
            "                                        >\n" +
            "                                            <table\n" +
            "                                                    height=\"0px\"\n" +
            "                                                    align=\"center\"\n" +
            "                                                    border=\"0\"\n" +
            "                                                    cellpadding=\"0\"\n" +
            "                                                    cellspacing=\"0\"\n" +
            "                                                    width=\"100%\"\n" +
            "                                                    style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder-collapse: collapse;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttable-layout: fixed;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder-spacing: 0;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmso-table-lspace: 0pt;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmso-table-rspace: 0pt;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvertical-align: top;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder-top: 2px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsolid\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t#000000;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-ms-text-size-adjust: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-webkit-text-size-adjust: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                            >\n" +
            "                                                <tbody>\n" +
            "                                                <tr\n" +
            "                                                        style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvertical-align: top;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                                >\n" +
            "                                                    <td\n" +
            "                                                            style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder-collapse: collapse !important;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvertical-align: top;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-size: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmso-line-height-rule: exactly;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-ms-text-size-adjust: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-webkit-text-size-adjust: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                                    >\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span\n" +
            "                                                                                >&nbsp;</span\n" +
            "                                                                                >\n" +
            "                                                    </td>\n" +
            "                                                </tr>\n" +
            "                                                </tbody>\n" +
            "                                            </table>\n" +
            "                                        </td>\n" +
            "                                    </tr>\n" +
            "                                    </tbody>\n" +
            "                                </table>\n" +
            "\n" +
            "                                <table\n" +
            "                                        id=\"u_content_heading_3\"\n" +
            "                                        style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                        role=\"presentation\"\n" +
            "                                        cellpadding=\"0\"\n" +
            "                                        cellspacing=\"0\"\n" +
            "                                        width=\"100%\"\n" +
            "                                        border=\"0\"\n" +
            "                                >\n" +
            "                                    <tbody>\n" +
            "                                    <tr>\n" +
            "                                        <td\n" +
            "                                                class=\"v-container-padding-padding\"\n" +
            "                                                style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 50px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t10px 0px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t60px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                                align=\"left\"\n" +
            "                                        >\n" +
            "                                            <h1\n" +
            "                                                    class=\"v-font-size\"\n" +
            "                                                    style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmargin: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 140%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttext-align: left;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-size: 16px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                            >\n" +
            "                                                <strong\n" +
            "                                                >Need\n" +
            "                                                    help? No\n" +
            "                                                    Problem.<br\n" +
            "                                                    /></strong>\n" +
            "                                            </h1>\n" +
            "                                        </td>\n" +
            "                                    </tr>\n" +
            "                                    </tbody>\n" +
            "                                </table>\n" +
            "\n" +
            "                                <!--[if (!mso)&(!IE)]><!-->\n" +
            "                            </div>\n" +
            "                                <!--<![endif]-->\n" +
            "                            </div>\n" +
            "                        </div>\n" +
            "                        <!--[if (mso)|(IE)]></td><![endif]-->\n" +
            "                        <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "\n" +
            "            <div\n" +
            "                    class=\"u-row-container\"\n" +
            "                    style=\"padding: 0px; background-color: transparent\"\n" +
            "            >\n" +
            "                <div\n" +
            "                        class=\"u-row\"\n" +
            "                        style=\"\n" +
            "\t\t\t\t\t\t\t\t\tmargin: 0 auto;\n" +
            "\t\t\t\t\t\t\t\t\tmin-width: 320px;\n" +
            "\t\t\t\t\t\t\t\t\tmax-width: 600px;\n" +
            "\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\tword-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\tbackground-color: transparent;\n" +
            "\t\t\t\t\t\t\t\t\"\n" +
            "                >\n" +
            "                    <div\n" +
            "                            style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\tborder-collapse: collapse;\n" +
            "\t\t\t\t\t\t\t\t\t\tdisplay: table;\n" +
            "\t\t\t\t\t\t\t\t\t\twidth: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\theight: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\tbackground-color: transparent;\n" +
            "\t\t\t\t\t\t\t\t\t\"\n" +
            "                    >\n" +
            "                        <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: transparent;\"><![endif]-->\n" +
            "\n" +
            "                        <!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"background-color: #f3f3f3;width: 300px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\" valign=\"top\"><![endif]-->\n" +
            "                        <div\n" +
            "                                class=\"u-col u-col-50\"\n" +
            "                                style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tmax-width: 320px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\tmin-width: 300px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\tdisplay: table-cell;\n" +
            "\t\t\t\t\t\t\t\t\t\t\tvertical-align: top;\n" +
            "\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                        >\n" +
            "                            <div\n" +
            "                                    style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\tbackground-color: #f3f3f3;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\theight: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\twidth: 100% !important;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\tborder-radius: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t-webkit-border-radius: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t-moz-border-radius: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                            >\n" +
            "                                <!--[if (!mso)&(!IE)]><!--><div\n" +
            "                                    style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tbox-sizing: border-box;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\theight: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder-top: 0px solid\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\ttransparent;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder-left: 0px solid\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\ttransparent;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder-right: 0px solid\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\ttransparent;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder-bottom: 0px solid\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\ttransparent;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder-radius: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t-webkit-border-radius: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t-moz-border-radius: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                            ><!--<![endif]-->\n" +
            "                                <table\n" +
            "                                        id=\"u_content_heading_5\"\n" +
            "                                        style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                        role=\"presentation\"\n" +
            "                                        cellpadding=\"0\"\n" +
            "                                        cellspacing=\"0\"\n" +
            "                                        width=\"100%\"\n" +
            "                                        border=\"0\"\n" +
            "                                >\n" +
            "                                    <tbody>\n" +
            "                                    <tr>\n" +
            "                                        <td\n" +
            "                                                class=\"v-container-padding-padding\"\n" +
            "                                                style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 25px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t10px 0px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t60px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                                align=\"left\"\n" +
            "                                        >\n" +
            "                                            <h1\n" +
            "                                                    class=\"v-font-size\"\n" +
            "                                                    style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmargin: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 140%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttext-align: left;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-size: 14px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                            >\n" +
            "                                                <strong>\n" +
            "                                                    Contact\n" +
            "                                                    Support\n" +
            "                                                    <br\n" +
            "                                                    /></strong>\n" +
            "                                            </h1>\n" +
            "                                        </td>\n" +
            "                                    </tr>\n" +
            "                                    </tbody>\n" +
            "                                </table>\n" +
            "\n" +
            "                                <table\n" +
            "                                        id=\"u_content_text_6\"\n" +
            "                                        style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                        role=\"presentation\"\n" +
            "                                        cellpadding=\"0\"\n" +
            "                                        cellspacing=\"0\"\n" +
            "                                        width=\"100%\"\n" +
            "                                        border=\"0\"\n" +
            "                                >\n" +
            "                                    <tbody>\n" +
            "                                    <tr>\n" +
            "                                        <td\n" +
            "                                                class=\"v-container-padding-padding\"\n" +
            "                                                style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 10px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t60px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t50px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                                align=\"left\"\n" +
            "                                        >\n" +
            "                                            <div\n" +
            "                                                    class=\"v-font-size\"\n" +
            "                                                    style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcolor: #3f3f3f;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 140%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttext-align: left;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                            >\n" +
            "                                                <a\n" +
            "                                                        href=\"mailto:support@firramo.com\"\n" +
            "                                                >\n" +
            "                                                    support@firramo.com\n" +
            "                                                </a>\n" +
            "                                            </div>\n" +
            "                                        </td>\n" +
            "                                    </tr>\n" +
            "                                    </tbody>\n" +
            "                                </table>\n" +
            "\n" +
            "                                <!--[if (!mso)&(!IE)]><!-->\n" +
            "                            </div>\n" +
            "                                <!--<![endif]-->\n" +
            "                            </div>\n" +
            "                        </div>\n" +
            "                        <!--[if (mso)|(IE)]></td><![endif]-->\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "\n" +
            "            <div\n" +
            "                    class=\"u-row-container\"\n" +
            "                    style=\"padding: 0px; background-color: transparent\"\n" +
            "            >\n" +
            "                <div\n" +
            "                        class=\"u-row\"\n" +
            "                        style=\"\n" +
            "\t\t\t\t\t\t\t\t\tmargin: 0 auto;\n" +
            "\t\t\t\t\t\t\t\t\tmin-width: 320px;\n" +
            "\t\t\t\t\t\t\t\t\tmax-width: 600px;\n" +
            "\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\tword-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\tbackground-color: transparent;\n" +
            "\t\t\t\t\t\t\t\t\"\n" +
            "                >\n" +
            "                    <div\n" +
            "                            style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\tborder-collapse: collapse;\n" +
            "\t\t\t\t\t\t\t\t\t\tdisplay: table;\n" +
            "\t\t\t\t\t\t\t\t\t\twidth: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\theight: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\tbackground-color: transparent;\n" +
            "\t\t\t\t\t\t\t\t\t\"\n" +
            "                    >\n" +
            "                        <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: transparent;\"><![endif]-->\n" +
            "\n" +
            "                        <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\" valign=\"top\"><![endif]-->\n" +
            "                        <div\n" +
            "                                class=\"u-col u-col-100\"\n" +
            "                                style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tmax-width: 320px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\tmin-width: 600px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\tdisplay: table-cell;\n" +
            "\t\t\t\t\t\t\t\t\t\t\tvertical-align: top;\n" +
            "\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                        >\n" +
            "                            <div\n" +
            "                                    style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\theight: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\twidth: 100% !important;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\tborder-radius: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t-webkit-border-radius: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t-moz-border-radius: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                            >\n" +
            "                                <!--[if (!mso)&(!IE)]><!--><div\n" +
            "                                    style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tbox-sizing: border-box;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\theight: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder-top: 0px solid\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\ttransparent;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder-left: 0px solid\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\ttransparent;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder-right: 0px solid\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\ttransparent;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder-bottom: 0px solid\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\ttransparent;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder-radius: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t-webkit-border-radius: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t-moz-border-radius: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                            ><!--<![endif]-->\n" +
            "                                <table\n" +
            "                                        style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                        role=\"presentation\"\n" +
            "                                        cellpadding=\"0\"\n" +
            "                                        cellspacing=\"0\"\n" +
            "                                        width=\"100%\"\n" +
            "                                        border=\"0\"\n" +
            "                                >\n" +
            "                                    <tbody>\n" +
            "                                    <tr>\n" +
            "                                        <td\n" +
            "                                                class=\"v-container-padding-padding\"\n" +
            "                                                style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                                align=\"left\"\n" +
            "                                        >\n" +
            "                                            <table\n" +
            "                                                    height=\"0px\"\n" +
            "                                                    align=\"center\"\n" +
            "                                                    border=\"0\"\n" +
            "                                                    cellpadding=\"0\"\n" +
            "                                                    cellspacing=\"0\"\n" +
            "                                                    width=\"100%\"\n" +
            "                                                    style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder-collapse: collapse;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttable-layout: fixed;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder-spacing: 0;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmso-table-lspace: 0pt;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmso-table-rspace: 0pt;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvertical-align: top;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder-top: 1px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsolid\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t#bbbbbb;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-ms-text-size-adjust: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-webkit-text-size-adjust: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                            >\n" +
            "                                                <tbody>\n" +
            "                                                <tr\n" +
            "                                                        style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvertical-align: top;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                                >\n" +
            "                                                    <td\n" +
            "                                                            style=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder-collapse: collapse !important;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvertical-align: top;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-size: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmso-line-height-rule: exactly;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-ms-text-size-adjust: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-webkit-text-size-adjust: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "                                                    >\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span\n" +
            "                                                                                >&nbsp;</span\n" +
            "                                                                                >\n" +
            "                                                    </td>\n" +
            "                                                </tr>\n" +
            "                                                </tbody>\n" +
            "                                            </table>\n" +
            "                                        </td>\n" +
            "                                    </tr>\n" +
            "                                    </tbody>\n" +
            "                                </table>\n" +
            "\n" +
            "                                <!--[if (!mso)&(!IE)]><!-->\n" +
            "                            </div>\n" +
            "                                <!--<![endif]-->\n" +
            "                            </div>\n" +
            "                        </div>\n" +
            "                        <!--[if (mso)|(IE)]></td><![endif]-->\n" +
            "                        <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "\n" +
            "            <!--[if (mso)|(IE)]></td></tr></table><![endif]-->\n" +
            "        </td>\n" +
            "    </tr>\n" +
            "    </tbody>\n" +
            "</table>\n" +
            "<!--[if mso]></div><![endif]-->\n" +
            "<!--[if IE]></div><![endif]-->\n" +
            "</body>\n" +
            "</html>\n";
}
