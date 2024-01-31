package com.firramo.firramoapi.util.email_templates;

public class EmailResetPassword {
    public static String TEMPLATE = "<!DOCTYPE html>\n" +
            "<html\n" +
            "\txmlns=\"http://www.w3.org/1999/xhtml\"\n" +
            "\txmlns:v=\"urn:schemas-microsoft-com:vml\"\n" +
            "\txmlns:o=\"urn:schemas-microsoft-com:office:office\"\n" +
            ">\n" +
            "\t<head>\n" +
            "\t\t<!--[if gte mso 9]>\n" +
            "\t\t\t<xml>\n" +
            "\t\t\t\t<o:OfficeDocumentSettings>\n" +
            "\t\t\t\t\t<o:AllowPNG />\n" +
            "\t\t\t\t\t<o:PixelsPerInch>96</o:PixelsPerInch>\n" +
            "\t\t\t\t</o:OfficeDocumentSettings>\n" +
            "\t\t\t</xml>\n" +
            "\t\t<![endif]-->\n" +
            "\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
            "\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n" +
            "\t\t<meta name=\"x-apple-disable-message-reformatting\" />\n" +
            "\t\t<!--[if !mso]><!-->\n" +
            "\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n" +
            "\t\t<!--<![endif]-->\n" +
            "\t\t<title></title>\n" +
            "\n" +
            "\t\t<style type=\"text/css\">\n" +
            "\t\t\t@media only screen and (min-width: 620px) {\n" +
            "\t\t\t\t.u-row {\n" +
            "\t\t\t\t\twidth: 600px !important;\n" +
            "\t\t\t\t}\n" +
            "\t\t\t\t.u-row .u-col {\n" +
            "\t\t\t\t\tvertical-align: top;\n" +
            "\t\t\t\t}\n" +
            "\n" +
            "\t\t\t\t.u-row .u-col-50 {\n" +
            "\t\t\t\t\twidth: 300px !important;\n" +
            "\t\t\t\t}\n" +
            "\n" +
            "\t\t\t\t.u-row .u-col-100 {\n" +
            "\t\t\t\t\twidth: 600px !important;\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\n" +
            "\t\t\t@media (max-width: 620px) {\n" +
            "\t\t\t\t.u-row-container {\n" +
            "\t\t\t\t\tmax-width: 100% !important;\n" +
            "\t\t\t\t\tpadding-left: 0px !important;\n" +
            "\t\t\t\t\tpadding-right: 0px !important;\n" +
            "\t\t\t\t}\n" +
            "\t\t\t\t.u-row .u-col {\n" +
            "\t\t\t\t\tmin-width: 320px !important;\n" +
            "\t\t\t\t\tmax-width: 100% !important;\n" +
            "\t\t\t\t\tdisplay: block !important;\n" +
            "\t\t\t\t}\n" +
            "\t\t\t\t.u-row {\n" +
            "\t\t\t\t\twidth: 100% !important;\n" +
            "\t\t\t\t}\n" +
            "\t\t\t\t.u-col {\n" +
            "\t\t\t\t\twidth: 100% !important;\n" +
            "\t\t\t\t}\n" +
            "\t\t\t\t.u-col > div {\n" +
            "\t\t\t\t\tmargin: 0 auto;\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t\tbody {\n" +
            "\t\t\t\tmargin: 0;\n" +
            "\t\t\t\tpadding: 0;\n" +
            "\t\t\t}\n" +
            "\n" +
            "\t\t\ttable,\n" +
            "\t\t\ttr,\n" +
            "\t\t\ttd {\n" +
            "\t\t\t\tvertical-align: top;\n" +
            "\t\t\t\tborder-collapse: collapse;\n" +
            "\t\t\t}\n" +
            "\n" +
            "\t\t\tp {\n" +
            "\t\t\t\tmargin: 0;\n" +
            "\t\t\t}\n" +
            "\n" +
            "\t\t\t.ie-container table,\n" +
            "\t\t\t.mso-container table {\n" +
            "\t\t\t\ttable-layout: fixed;\n" +
            "\t\t\t}\n" +
            "\n" +
            "\t\t\t* {\n" +
            "\t\t\t\tline-height: inherit;\n" +
            "\t\t\t}\n" +
            "\n" +
            "\t\t\ta[x-apple-data-detectors=\"true\"] {\n" +
            "\t\t\t\tcolor: inherit !important;\n" +
            "\t\t\t\ttext-decoration: none !important;\n" +
            "\t\t\t}\n" +
            "\n" +
            "\t\t\ttable,\n" +
            "\t\t\ttd {\n" +
            "\t\t\t\tcolor: #000000;\n" +
            "\t\t\t}\n" +
            "\t\t\t#u_body a {\n" +
            "\t\t\t\tcolor: #0000ee;\n" +
            "\t\t\t\ttext-decoration: underline;\n" +
            "\t\t\t}\n" +
            "\t\t\t@media (max-width: 480px) {\n" +
            "\t\t\t\t#u_content_heading_1 .v-container-padding-padding {\n" +
            "\t\t\t\t\tpadding: 40px 10px 20px !important;\n" +
            "\t\t\t\t}\n" +
            "\t\t\t\t#u_content_heading_1 .v-font-size {\n" +
            "\t\t\t\t\tfont-size: 23px !important;\n" +
            "\t\t\t\t}\n" +
            "\t\t\t\t#u_content_image_1 .v-container-padding-padding {\n" +
            "\t\t\t\t\tpadding: 0px 0px 20px !important;\n" +
            "\t\t\t\t}\n" +
            "\t\t\t\t#u_content_heading_2 .v-container-padding-padding {\n" +
            "\t\t\t\t\tpadding: 40px 10px 0px !important;\n" +
            "\t\t\t\t}\n" +
            "\t\t\t\t#u_content_text_3 .v-container-padding-padding {\n" +
            "\t\t\t\t\tpadding: 10px 10px 0px !important;\n" +
            "\t\t\t\t}\n" +
            "\t\t\t\t#u_content_text_5 .v-container-padding-padding {\n" +
            "\t\t\t\t\tpadding: 10px 10px 20px !important;\n" +
            "\t\t\t\t}\n" +
            "\t\t\t\t#u_content_button_1 .v-size-width {\n" +
            "\t\t\t\t\twidth: 65% !important;\n" +
            "\t\t\t\t}\n" +
            "\t\t\t\t#u_content_text_2 .v-container-padding-padding {\n" +
            "\t\t\t\t\tpadding: 20px 10px 10px !important;\n" +
            "\t\t\t\t}\n" +
            "\t\t\t\t#u_content_text_1 .v-container-padding-padding {\n" +
            "\t\t\t\t\tpadding: 10px 10px 40px !important;\n" +
            "\t\t\t\t}\n" +
            "\t\t\t\t#u_content_heading_3 .v-container-padding-padding {\n" +
            "\t\t\t\t\tpadding: 40px 10px 0px !important;\n" +
            "\t\t\t\t}\n" +
            "\t\t\t\t#u_content_heading_5 .v-container-padding-padding {\n" +
            "\t\t\t\t\tpadding: 20px 10px 0px !important;\n" +
            "\t\t\t\t}\n" +
            "\t\t\t\t#u_content_text_6 .v-container-padding-padding {\n" +
            "\t\t\t\t\tpadding: 10px 10px 20px !important;\n" +
            "\t\t\t\t}\n" +
            "\t\t\t\t#u_content_heading_4 .v-container-padding-padding {\n" +
            "\t\t\t\t\tpadding: 10px 10px 0px !important;\n" +
            "\t\t\t\t}\n" +
            "\t\t\t\t#u_content_text_4 .v-container-padding-padding {\n" +
            "\t\t\t\t\tpadding: 10px 10px 40px !important;\n" +
            "\t\t\t\t}\n" +
            "\t\t\t\t#u_content_social_1 .v-container-padding-padding {\n" +
            "\t\t\t\t\tpadding: 30px 10px 10px !important;\n" +
            "\t\t\t\t}\n" +
            "\t\t\t\t#u_content_text_deprecated_1 .v-container-padding-padding {\n" +
            "\t\t\t\t\tpadding: 10px 10px 20px !important;\n" +
            "\t\t\t\t}\n" +
            "\t\t\t\t#u_content_image_2 .v-container-padding-padding {\n" +
            "\t\t\t\t\tpadding: 20px 10px 30px !important;\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t</style>\n" +
            "\n" +
            "\t\t<!--[if !mso]><!-->\n" +
            "\t\t<link\n" +
            "\t\t\thref=\"https://fonts.googleapis.com/css?family=Open+Sans:400,700\"\n" +
            "\t\t\trel=\"stylesheet\"\n" +
            "\t\t\ttype=\"text/css\"\n" +
            "\t\t/>\n" +
            "\t\t<!--<![endif]-->\n" +
            "\t\t<style type=\"text/css\" id=\"cliqz-adblokcer-css-rules\">\n" +
            "\t\t\t[data-ad-name], [data-ad-width], [id^=\"google_ads_iframe\"], div[aria-label=\"Ads\"], div[data-ad-targeting], div[data-native_ad], div[id^=\"ad_position_\"], div[id^=\"dfp-ad-\"], div[id^=\"ezoic-pub-ad-\"], div[id^=\"yandex_ad\"], ins.adsbygoogle, div[id*=\"ScriptRoot\"], a[onmousedown^=\"this.href='https://paid.outbrain.com/network/redir?\"][target=\"_blank\"], amp-embed[type=\"taboola\"]\n" +
            "\t\t\t{\n" +
            "\t\t\t\tdisplay: none !important;\n" +
            "\t\t\t}\n" +
            "\t\t</style>\n" +
            "\t\t<style type=\"text/css\" id=\"cliqz-adblokcer-css-rules\">\n" +
            "\t\t\tapp-cookies,\n" +
            "\t\t\tdiv[data-gdpr-consent-prompt],\n" +
            "\t\t\tdiv[data-testid=\"cookie-policy-banner\"],\n" +
            "\t\t\tsibbo-cmp-layout,\n" +
            "\t\t\tthor-cookies,\n" +
            "\t\t\tdiv#__tealiumGDPRecModal,\n" +
            "\t\t\tdiv#cookie-modal,\n" +
            "\t\t\tdiv#cookie-popup,\n" +
            "\t\t\tdiv#cookieConsentModal,\n" +
            "\t\t\tdiv#privacy_policy,\n" +
            "\t\t\tdiv.c-cookies,\n" +
            "\t\t\tdiv.ccpa-message,\n" +
            "\t\t\tdiv.cookie-alert,\n" +
            "\t\t\tdiv.cookie-banner,\n" +
            "\t\t\tdiv.cookie-bar,\n" +
            "\t\t\tdiv.cookie-consent,\n" +
            "\t\t\tdiv.cookie-consent-modal,\n" +
            "\t\t\tdiv.cookie-consent-popup,\n" +
            "\t\t\tdiv.cookie-container,\n" +
            "\t\t\tdiv.cookie-content,\n" +
            "\t\t\tdiv.cookie-disclaimer,\n" +
            "\t\t\tdiv.cookie-eu,\n" +
            "\t\t\tdiv.cookie-layer,\n" +
            "\t\t\tdiv.cookie-notice,\n" +
            "\t\t\tdiv.cookie-notice-wrapper,\n" +
            "\t\t\tdiv.cookie-notification,\n" +
            "\t\t\tdiv.cookie-overlay,\n" +
            "\t\t\tdiv.cookie-policy,\n" +
            "\t\t\tdiv.cookie-popup,\n" +
            "\t\t\tdiv.cookie-wrapper,\n" +
            "\t\t\tdiv.cookieHolder,\n" +
            "\t\t\tdiv.cookieconsent,\n" +
            "\t\t\tdiv.cookies-banner,\n" +
            "\t\t\tdiv.cookies-modal-container,\n" +
            "\t\t\tdiv.cookies-visible,\n" +
            "\t\t\tdiv.gdpr,\n" +
            "\t\t\tdiv.js-disclaimer,\n" +
            "\t\t\tdiv.privacy-modal,\n" +
            "\t\t\tdiv.privacy-notice,\n" +
            "\t\t\tdiv.v-cookie,\n" +
            "\t\t\tdiv.with-cookie,\n" +
            "\t\t\tsection.cookie-banner {\n" +
            "\t\t\t\tdisplay: none !important;\n" +
            "\t\t\t}\n" +
            "\t\t</style>\n" +
            "\t\t<style type=\"text/css\" id=\"cliqz-adblokcer-css-rules\">\n" +
            "\t\t\t[href*=\"uselnk.com/\"],\n" +
            "\t\t\t[href*=\"postlnk.com\"],\n" +
            "\t\t\t[href*=\"passtechusa.com\"] {\n" +
            "\t\t\t\tdisplay: none !important;\n" +
            "\t\t\t}\n" +
            "\t\t</style>\n" +
            "\t\t<style type=\"text/css\" id=\"cliqz-adblokcer-css-rules\">\n" +
            "\t\t\t[href=\"https://devowl.io/wordpress-real-cookie-banner/\"]\n" +
            "\t\t\t{\n" +
            "\t\t\t\tdisplay: none !important;\n" +
            "\t\t\t}\n" +
            "\t\t</style>\n" +
            "\t\t<style type=\"text/css\" id=\"cliqz-adblokcer-css-rules\">\n" +
            "\t\t\t[data-ad-name], [data-ad-width], [id^=\"google_ads_iframe\"], div[aria-label=\"Ads\"], div[data-ad-targeting], div[data-native_ad], div[id^=\"ad_position_\"], div[id^=\"dfp-ad-\"], div[id^=\"ezoic-pub-ad-\"], div[id^=\"yandex_ad\"], ins.adsbygoogle, div[id*=\"ScriptRoot\"], a[onmousedown^=\"this.href='https://paid.outbrain.com/network/redir?\"][target=\"_blank\"], amp-embed[type=\"taboola\"]\n" +
            "\t\t\t{\n" +
            "\t\t\t\tdisplay: none !important;\n" +
            "\t\t\t}\n" +
            "\t\t</style>\n" +
            "\t\t<style type=\"text/css\" id=\"cliqz-adblokcer-css-rules\">\n" +
            "\t\t\tapp-cookies,\n" +
            "\t\t\tdiv[data-gdpr-consent-prompt],\n" +
            "\t\t\tdiv[data-testid=\"cookie-policy-banner\"],\n" +
            "\t\t\tsibbo-cmp-layout,\n" +
            "\t\t\tthor-cookies,\n" +
            "\t\t\tdiv#__tealiumGDPRecModal,\n" +
            "\t\t\tdiv#cookie-modal,\n" +
            "\t\t\tdiv#cookie-popup,\n" +
            "\t\t\tdiv#cookieConsentModal,\n" +
            "\t\t\tdiv#privacy_policy,\n" +
            "\t\t\tdiv.c-cookies,\n" +
            "\t\t\tdiv.ccpa-message,\n" +
            "\t\t\tdiv.cookie-alert,\n" +
            "\t\t\tdiv.cookie-banner,\n" +
            "\t\t\tdiv.cookie-bar,\n" +
            "\t\t\tdiv.cookie-consent,\n" +
            "\t\t\tdiv.cookie-consent-modal,\n" +
            "\t\t\tdiv.cookie-consent-popup,\n" +
            "\t\t\tdiv.cookie-container,\n" +
            "\t\t\tdiv.cookie-content,\n" +
            "\t\t\tdiv.cookie-disclaimer,\n" +
            "\t\t\tdiv.cookie-eu,\n" +
            "\t\t\tdiv.cookie-layer,\n" +
            "\t\t\tdiv.cookie-notice,\n" +
            "\t\t\tdiv.cookie-notice-wrapper,\n" +
            "\t\t\tdiv.cookie-notification,\n" +
            "\t\t\tdiv.cookie-overlay,\n" +
            "\t\t\tdiv.cookie-policy,\n" +
            "\t\t\tdiv.cookie-popup,\n" +
            "\t\t\tdiv.cookie-wrapper,\n" +
            "\t\t\tdiv.cookieHolder,\n" +
            "\t\t\tdiv.cookieconsent,\n" +
            "\t\t\tdiv.cookies-banner,\n" +
            "\t\t\tdiv.cookies-modal-container,\n" +
            "\t\t\tdiv.cookies-visible,\n" +
            "\t\t\tdiv.gdpr,\n" +
            "\t\t\tdiv.js-disclaimer,\n" +
            "\t\t\tdiv.privacy-modal,\n" +
            "\t\t\tdiv.privacy-notice,\n" +
            "\t\t\tdiv.v-cookie,\n" +
            "\t\t\tdiv.with-cookie,\n" +
            "\t\t\tsection.cookie-banner {\n" +
            "\t\t\t\tdisplay: none !important;\n" +
            "\t\t\t}\n" +
            "\t\t</style>\n" +
            "\t\t<style type=\"text/css\" id=\"cliqz-adblokcer-css-rules\">\n" +
            "\t\t\t[data-ad-name], [data-ad-width], [id^=\"google_ads_iframe\"], div[aria-label=\"Ads\"], div[data-ad-targeting], div[data-native_ad], div[id^=\"ad_position_\"], div[id^=\"dfp-ad-\"], div[id^=\"ezoic-pub-ad-\"], div[id^=\"yandex_ad\"], ins.adsbygoogle, div[id*=\"ScriptRoot\"], a[onmousedown^=\"this.href='https://paid.outbrain.com/network/redir?\"][target=\"_blank\"], amp-embed[type=\"taboola\"]\n" +
            "\t\t\t{\n" +
            "\t\t\t\tdisplay: none !important;\n" +
            "\t\t\t}\n" +
            "\t\t</style>\n" +
            "\t\t<style type=\"text/css\" id=\"cliqz-adblokcer-css-rules\">\n" +
            "\t\t\tapp-cookies,\n" +
            "\t\t\tdiv[data-gdpr-consent-prompt],\n" +
            "\t\t\tdiv[data-testid=\"cookie-policy-banner\"],\n" +
            "\t\t\tsibbo-cmp-layout,\n" +
            "\t\t\tthor-cookies,\n" +
            "\t\t\tdiv#__tealiumGDPRecModal,\n" +
            "\t\t\tdiv#cookie-modal,\n" +
            "\t\t\tdiv#cookie-popup,\n" +
            "\t\t\tdiv#cookieConsentModal,\n" +
            "\t\t\tdiv#privacy_policy,\n" +
            "\t\t\tdiv.c-cookies,\n" +
            "\t\t\tdiv.ccpa-message,\n" +
            "\t\t\tdiv.cookie-alert,\n" +
            "\t\t\tdiv.cookie-banner,\n" +
            "\t\t\tdiv.cookie-bar,\n" +
            "\t\t\tdiv.cookie-consent,\n" +
            "\t\t\tdiv.cookie-consent-modal,\n" +
            "\t\t\tdiv.cookie-consent-popup,\n" +
            "\t\t\tdiv.cookie-container,\n" +
            "\t\t\tdiv.cookie-content,\n" +
            "\t\t\tdiv.cookie-disclaimer,\n" +
            "\t\t\tdiv.cookie-eu,\n" +
            "\t\t\tdiv.cookie-layer,\n" +
            "\t\t\tdiv.cookie-notice,\n" +
            "\t\t\tdiv.cookie-notice-wrapper,\n" +
            "\t\t\tdiv.cookie-notification,\n" +
            "\t\t\tdiv.cookie-overlay,\n" +
            "\t\t\tdiv.cookie-policy,\n" +
            "\t\t\tdiv.cookie-popup,\n" +
            "\t\t\tdiv.cookie-wrapper,\n" +
            "\t\t\tdiv.cookieHolder,\n" +
            "\t\t\tdiv.cookieconsent,\n" +
            "\t\t\tdiv.cookies-banner,\n" +
            "\t\t\tdiv.cookies-modal-container,\n" +
            "\t\t\tdiv.cookies-visible,\n" +
            "\t\t\tdiv.gdpr,\n" +
            "\t\t\tdiv.js-disclaimer,\n" +
            "\t\t\tdiv.privacy-modal,\n" +
            "\t\t\tdiv.privacy-notice,\n" +
            "\t\t\tdiv.v-cookie,\n" +
            "\t\t\tdiv.with-cookie,\n" +
            "\t\t\tsection.cookie-banner {\n" +
            "\t\t\t\tdisplay: none !important;\n" +
            "\t\t\t}\n" +
            "\t\t</style>\n" +
            "\t\t<style type=\"text/css\" id=\"cliqz-adblokcer-css-rules\">\n" +
            "\t\t\t.ads.bottom,\n" +
            "\t\t\t.ads.box,\n" +
            "\t\t\t.ads.cell,\n" +
            "\t\t\t.ads.cta,\n" +
            "\t\t\t.ads.grid-layout,\n" +
            "\t\t\t.ads.square,\n" +
            "\t\t\t.ads.top,\n" +
            "\t\t\t.ads.widget,\n" +
            "\t\t\t.ad.addon,\n" +
            "\t\t\t.ad.bottom_article_leaderboard,\n" +
            "\t\t\t.ad.bottomrect,\n" +
            "\t\t\t.ad.box,\n" +
            "\t\t\t.ad.brandboard,\n" +
            "\t\t\t.ad.card,\n" +
            "\t\t\t.ad.center,\n" +
            "\t\t\t.ad.contentboard,\n" +
            "\t\t\t.ad.desktop-970x250,\n" +
            "\t\t\t.ad.element,\n" +
            "\t\t\t.ad.floater-link,\n" +
            "\t\t\t.ad.gallery,\n" +
            "\t\t\t.ad.halfpage,\n" +
            "\t\t\t.ad.inner,\n" +
            "\t\t\t.ad.item,\n" +
            "\t\t\t.ad.leaderboard,\n" +
            "\t\t\t.ad.maxiboard,\n" +
            "\t\t\t.ad.maxisky,\n" +
            "\t\t\t.ad.middlerect,\n" +
            "\t\t\t.ad.module,\n" +
            "\t\t\t.ad.monsterboard,\n" +
            "\t\t\t.ad.native_story_1,\n" +
            "\t\t\t.ad.native_story_2,\n" +
            "\t\t\t.ad.native_story_3,\n" +
            "\t\t\t.ad.netboard,\n" +
            "\t\t\t.ad.post-area,\n" +
            "\t\t\t.ad.preroll,\n" +
            "\t\t\t.ad.promotion,\n" +
            "\t\t\t.ad.rectangle,\n" +
            "\t\t\t.ad.rectangle_2,\n" +
            "\t\t\t.ad.rectangle_3,\n" +
            "\t\t\t.ad.rectangle_home_1,\n" +
            "\t\t\t.ad.section,\n" +
            "\t\t\t.ad.sidebar-module,\n" +
            "\t\t\t.ad.size-300x250,\n" +
            "\t\t\t.ad.skybridgeleft,\n" +
            "\t\t\t.ad.small-mpu,\n" +
            "\t\t\t.ad.small-teaser,\n" +
            "\t\t\t.ad.super,\n" +
            "\t\t\t.ad.top_article_leadeboard,\n" +
            "\t\t\t.ad.wideboard,\n" +
            "\t\t\t.ad.wideboard_tablet,\n" +
            "\t\t\t.ad.widget {\n" +
            "\t\t\t\tdisplay: none !important;\n" +
            "\t\t\t}\n" +
            "\t\t</style>\n" +
            "\t</head>\n" +
            "\n" +
            "\t<body\n" +
            "\t\tclass=\"clean-body u_body\"\n" +
            "\t\tstyle=\"\n" +
            "\t\t\tmargin: 0;\n" +
            "\t\t\tpadding: 0;\n" +
            "\t\t\t-webkit-text-size-adjust: 100%;\n" +
            "\t\t\tbackground-color: #ffffff;\n" +
            "\t\t\tcolor: #000000;\n" +
            "\t\t\"\n" +
            "\t\tdata-new-gr-c-s-check-loaded=\"14.1121.0\"\n" +
            "\t\tdata-gr-ext-installed=\"\"\n" +
            "\t\tbis_status=\"ok\"\n" +
            "\t\tbis_frame_id=\"290\"\n" +
            "\t>\n" +
            "\t\t<!--[if IE]><div class=\"ie-container\"><![endif]-->\n" +
            "\t\t<!--[if mso]><div class=\"mso-container\"><![endif]-->\n" +
            "\t\t<table\n" +
            "\t\t\tid=\"u_body\"\n" +
            "\t\t\tstyle=\"\n" +
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
            "\t\t\tcellpadding=\"0\"\n" +
            "\t\t\tcellspacing=\"0\"\n" +
            "\t\t>\n" +
            "\t\t\t<tbody>\n" +
            "\t\t\t\t<tr style=\"vertical-align: top\">\n" +
            "\t\t\t\t\t<td\n" +
            "\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\tborder-collapse: collapse !important;\n" +
            "\t\t\t\t\t\t\tvertical-align: top;\n" +
            "\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t<!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td align=\"center\" style=\"background-color: #ffffff;\"><![endif]-->\n" +
            "\n" +
            "\t\t\t\t\t\t<div\n" +
            "\t\t\t\t\t\t\tclass=\"u-row-container\"\n" +
            "\t\t\t\t\t\t\tstyle=\"padding: 0px; background-color: transparent\"\n" +
            "\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t<div\n" +
            "\t\t\t\t\t\t\t\tclass=\"u-row\"\n" +
            "\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\tmargin: 0 auto;\n" +
            "\t\t\t\t\t\t\t\t\tmin-width: 320px;\n" +
            "\t\t\t\t\t\t\t\t\tmax-width: 600px;\n" +
            "\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\tword-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\tbackground-color: transparent;\n" +
            "\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t<div\n" +
            "\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\tborder-collapse: collapse;\n" +
            "\t\t\t\t\t\t\t\t\t\tdisplay: table;\n" +
            "\t\t\t\t\t\t\t\t\t\twidth: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\theight: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\tbackground-color: transparent;\n" +
            "\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t<!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: transparent;\"><![endif]-->\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t\t<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"background-color: #ecf0f1;width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
            "\t\t\t\t\t\t\t\t\t<div\n" +
            "\t\t\t\t\t\t\t\t\t\tclass=\"u-col u-col-100\"\n" +
            "\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tmax-width: 320px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\tmin-width: 600px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\tdisplay: table-cell;\n" +
            "\t\t\t\t\t\t\t\t\t\t\tvertical-align: top;\n" +
            "\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t<div\n" +
            "\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\tbackground-color: #ecf0f1;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\theight: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\twidth: 100% !important;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<!--[if (!mso)&(!IE)]><!--><div\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
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
            "\t\t\t\t\t\t\t\t\t\t\t><!--<![endif]-->\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<table\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"u_content_heading_1\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\trole=\"presentation\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tcellpadding=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tcellspacing=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"100%\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"v-container-padding-padding\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding-left: 50px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding-top: 20px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"https://firramo.com/logo/feramo-logo-mini.png\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\talt=\"Logo\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
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
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"149\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t/>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"v-container-padding-padding\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 50px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t10px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t25px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding-top: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\talign=\"left\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h1\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"v-font-size\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmargin: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcolor: #6366f2;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 140%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttext-align: center;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-size: 23px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<strong\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>Forgot\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tyour\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpassword?</strong\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</h1>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<table\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"u_content_image_1\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\trole=\"presentation\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tcellpadding=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tcellspacing=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"100%\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"v-container-padding-padding\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 0px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t0px 25px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\talign=\"left\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"100%\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcellpadding=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcellspacing=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding-right: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding-left: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\talign=\"center\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\talign=\"center\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"https://cdn.templates.unlayer.com/assets/1676548989699-gif.gif\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\talt=\"image\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle=\"image\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
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
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"500\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t/>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<!--[if (!mso)&(!IE)]><!-->\n" +
            "\t\t\t\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<!--<![endif]-->\n" +
            "\t\t\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t\t\t<!--[if (mso)|(IE)]></td><![endif]-->\n" +
            "\t\t\t\t\t\t\t\t\t<!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
            "\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\n" +
            "\t\t\t\t\t\t<div\n" +
            "\t\t\t\t\t\t\tclass=\"u-row-container\"\n" +
            "\t\t\t\t\t\t\tstyle=\"padding: 0px; background-color: transparent\"\n" +
            "\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t<div\n" +
            "\t\t\t\t\t\t\t\tclass=\"u-row\"\n" +
            "\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\tmargin: 0 auto;\n" +
            "\t\t\t\t\t\t\t\t\tmin-width: 320px;\n" +
            "\t\t\t\t\t\t\t\t\tmax-width: 600px;\n" +
            "\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\tword-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\tbackground-color: transparent;\n" +
            "\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t<div\n" +
            "\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\tborder-collapse: collapse;\n" +
            "\t\t\t\t\t\t\t\t\t\tdisplay: table;\n" +
            "\t\t\t\t\t\t\t\t\t\twidth: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\theight: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\tbackground-color: transparent;\n" +
            "\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t<!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: transparent;\"><![endif]-->\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t\t<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"background-color: #f3f3f3;width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\" valign=\"top\"><![endif]-->\n" +
            "\t\t\t\t\t\t\t\t\t<div\n" +
            "\t\t\t\t\t\t\t\t\t\tclass=\"u-col u-col-100\"\n" +
            "\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tmax-width: 320px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\tmin-width: 600px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\tdisplay: table-cell;\n" +
            "\t\t\t\t\t\t\t\t\t\t\tvertical-align: top;\n" +
            "\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t<div\n" +
            "\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\tbackground-color: #f3f3f3;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\theight: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\twidth: 100% !important;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\tborder-radius: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t-webkit-border-radius: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t-moz-border-radius: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<!--[if (!mso)&(!IE)]><!--><div\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
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
            "\t\t\t\t\t\t\t\t\t\t\t><!--<![endif]-->\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<table\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"u_content_heading_2\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\trole=\"presentation\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tcellpadding=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tcellspacing=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"100%\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"v-container-padding-padding\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 50px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t10px 0px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t60px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\talign=\"left\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h1\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"v-font-size\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmargin: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 140%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttext-align: left;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-size: 22px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tHello {{ name }}!\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</h1>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<table\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"u_content_text_3\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\trole=\"presentation\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tcellpadding=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tcellspacing=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"100%\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"v-container-padding-padding\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 10px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t60px 2px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\talign=\"left\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"v-font-size\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-size: 16px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 140%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttext-align: left;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 140%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tTo reset\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tyour\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpassword,\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclick\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tthe\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tbutton\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tbelow.\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tThe link\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twill be\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tinvalid\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tafter 20\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tminutes.&nbsp;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</p>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<table\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"u_content_button_1\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\trole=\"presentation\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tcellpadding=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tcellspacing=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"100%\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"v-container-padding-padding\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\talign=\"left\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!--[if mso\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t]><style>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.v-button {\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tbackground: transparent !important;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</style><!\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t[endif]-->\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\talign=\"center\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!--[if mso]><v:roundrect xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:w=\"urn:schemas-microsoft-com:office:word\" href=\"https://www.unlayer.com\" style=\"height:37px; v-text-anchor:middle; width:208px;\" arcsize=\"11%\"  strokecolor=\"#000000\" strokeweight=\"1px\" fillcolor=\"#000000\"><w:anchorlock/><center style=\"color:#ffffff;font-family:'Open Sans',sans-serif;\"><![endif]-->\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\thref=\"https://www.firramo.com/reset-password?id={{ token }}\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"_blank\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"v-button v-size-width v-font-size\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
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
            "                                                                            margin-top: 20px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdisplay: block;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 10px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t20px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 120%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t><strong\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t><span\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 16.8px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>Reset\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpassword</span\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t></strong\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t></span\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!--[if mso]></center></v:roundrect><![endif]-->\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<table\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"u_content_text_2\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\trole=\"presentation\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tcellpadding=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tcellspacing=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"100%\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"v-container-padding-padding\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 30px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t60px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t10px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\talign=\"left\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"v-font-size\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcolor: #3f3f3f;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 140%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttext-align: justify;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 140%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tIf you\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdo not\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twant to\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tchange\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tyour\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpassword\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tor\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdidn't\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\trequest\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ta reset,\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tyou can\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tignore\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tand\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdelete\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tthis\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\temail.\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</p>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<table\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"u_content_text_1\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\trole=\"presentation\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tcellpadding=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tcellspacing=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"100%\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"v-container-padding-padding\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 10px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t60px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t50px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\talign=\"left\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"v-font-size\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-size: 16px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 140%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttext-align: left;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 140%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tThanks,\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</p>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 140%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tFirramo\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tCustomer\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tService\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</p>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<table\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\trole=\"presentation\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tcellpadding=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tcellspacing=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"100%\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"v-container-padding-padding\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\talign=\"left\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\theight=\"0px\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\talign=\"center\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcellpadding=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcellspacing=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"100%\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
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
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvertical-align: top;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder-collapse: collapse !important;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvertical-align: top;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-size: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmso-line-height-rule: exactly;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-ms-text-size-adjust: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-webkit-text-size-adjust: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>&nbsp;</span\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<table\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"u_content_heading_3\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\trole=\"presentation\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tcellpadding=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tcellspacing=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"100%\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"v-container-padding-padding\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 50px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t10px 0px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t60px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\talign=\"left\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h1\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"v-font-size\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmargin: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 140%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttext-align: left;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-size: 16px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<strong\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>Need\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\thelp? No\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tProblem.<br\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t/></strong>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</h1>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<!--[if (!mso)&(!IE)]><!-->\n" +
            "\t\t\t\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<!--<![endif]-->\n" +
            "\t\t\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t\t\t<!--[if (mso)|(IE)]></td><![endif]-->\n" +
            "\t\t\t\t\t\t\t\t\t<!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
            "\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\n" +
            "\t\t\t\t\t\t<div\n" +
            "\t\t\t\t\t\t\tclass=\"u-row-container\"\n" +
            "\t\t\t\t\t\t\tstyle=\"padding: 0px; background-color: transparent\"\n" +
            "\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t<div\n" +
            "\t\t\t\t\t\t\t\tclass=\"u-row\"\n" +
            "\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\tmargin: 0 auto;\n" +
            "\t\t\t\t\t\t\t\t\tmin-width: 320px;\n" +
            "\t\t\t\t\t\t\t\t\tmax-width: 600px;\n" +
            "\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\tword-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\tbackground-color: transparent;\n" +
            "\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t<div\n" +
            "\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\tborder-collapse: collapse;\n" +
            "\t\t\t\t\t\t\t\t\t\tdisplay: table;\n" +
            "\t\t\t\t\t\t\t\t\t\twidth: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\theight: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\tbackground-color: transparent;\n" +
            "\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t<!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: transparent;\"><![endif]-->\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t\t<!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"background-color: #f3f3f3;width: 300px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\" valign=\"top\"><![endif]-->\n" +
            "\t\t\t\t\t\t\t\t\t<div\n" +
            "\t\t\t\t\t\t\t\t\t\tclass=\"u-col u-col-50\"\n" +
            "\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tmax-width: 320px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\tmin-width: 300px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\tdisplay: table-cell;\n" +
            "\t\t\t\t\t\t\t\t\t\t\tvertical-align: top;\n" +
            "\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t<div\n" +
            "\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\tbackground-color: #f3f3f3;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\theight: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\twidth: 100% !important;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\tborder-radius: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t-webkit-border-radius: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t-moz-border-radius: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<!--[if (!mso)&(!IE)]><!--><div\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
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
            "\t\t\t\t\t\t\t\t\t\t\t><!--<![endif]-->\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<table\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"u_content_heading_5\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\trole=\"presentation\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tcellpadding=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tcellspacing=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"100%\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"v-container-padding-padding\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 25px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t10px 0px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t60px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\talign=\"left\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h1\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"v-font-size\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmargin: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 140%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttext-align: left;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-size: 14px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<strong>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tContact\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSupport\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<br\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t/></strong>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</h1>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<table\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"u_content_text_6\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\trole=\"presentation\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tcellpadding=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tcellspacing=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"100%\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"v-container-padding-padding\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 10px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t60px\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t50px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\talign=\"left\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"v-font-size\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcolor: #3f3f3f;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 140%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttext-align: left;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\thref=\"mailto:support@firramo.com\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsupport@firramo.com\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<!--[if (!mso)&(!IE)]><!-->\n" +
            "\t\t\t\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<!--<![endif]-->\n" +
            "\t\t\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t\t\t<!--[if (mso)|(IE)]></td><![endif]-->\n" +
            "\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\n" +
            "\t\t\t\t\t\t<div\n" +
            "\t\t\t\t\t\t\tclass=\"u-row-container\"\n" +
            "\t\t\t\t\t\t\tstyle=\"padding: 0px; background-color: transparent\"\n" +
            "\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t<div\n" +
            "\t\t\t\t\t\t\t\tclass=\"u-row\"\n" +
            "\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\tmargin: 0 auto;\n" +
            "\t\t\t\t\t\t\t\t\tmin-width: 320px;\n" +
            "\t\t\t\t\t\t\t\t\tmax-width: 600px;\n" +
            "\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\tword-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\tbackground-color: transparent;\n" +
            "\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t<div\n" +
            "\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\tborder-collapse: collapse;\n" +
            "\t\t\t\t\t\t\t\t\t\tdisplay: table;\n" +
            "\t\t\t\t\t\t\t\t\t\twidth: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\theight: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\tbackground-color: transparent;\n" +
            "\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t<!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: transparent;\"><![endif]-->\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t\t<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\" valign=\"top\"><![endif]-->\n" +
            "\t\t\t\t\t\t\t\t\t<div\n" +
            "\t\t\t\t\t\t\t\t\t\tclass=\"u-col u-col-100\"\n" +
            "\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tmax-width: 320px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\tmin-width: 600px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\tdisplay: table-cell;\n" +
            "\t\t\t\t\t\t\t\t\t\t\tvertical-align: top;\n" +
            "\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t<div\n" +
            "\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\theight: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\twidth: 100% !important;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\tborder-radius: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t-webkit-border-radius: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t-moz-border-radius: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<!--[if (!mso)&(!IE)]><!--><div\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
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
            "\t\t\t\t\t\t\t\t\t\t\t><!--<![endif]-->\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<table\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\trole=\"presentation\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tcellpadding=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tcellspacing=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"100%\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tborder=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"v-container-padding-padding\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toverflow-wrap: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpadding: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-family: 'Open Sans',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsans-serif;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\talign=\"left\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\theight=\"0px\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\talign=\"center\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcellpadding=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcellspacing=\"0\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"100%\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
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
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvertical-align: top;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tword-break: break-word;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder-collapse: collapse !important;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvertical-align: top;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfont-size: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tline-height: 0px;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmso-line-height-rule: exactly;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-ms-text-size-adjust: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-webkit-text-size-adjust: 100%;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>&nbsp;</span\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t<!--[if (!mso)&(!IE)]><!-->\n" +
            "\t\t\t\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<!--<![endif]-->\n" +
            "\t\t\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t\t\t<!--[if (mso)|(IE)]></td><![endif]-->\n" +
            "\t\t\t\t\t\t\t\t\t<!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
            "\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\n" +
            "\t\t\t\t\t\t<!--[if (mso)|(IE)]></td></tr></table><![endif]-->\n" +
            "\t\t\t\t\t</td>\n" +
            "\t\t\t\t</tr>\n" +
            "\t\t\t</tbody>\n" +
            "\t\t</table>\n" +
            "\t\t<!--[if mso]></div><![endif]-->\n" +
            "\t\t<!--[if IE]></div><![endif]-->\n" +
            "\t</body>\n" +
            "</html>\n";
}
