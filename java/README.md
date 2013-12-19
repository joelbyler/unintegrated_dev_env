START Jetty:
gradle jettyRun

INSTALL GUARD DEPENDENCIES:
bundle install

START AUTOTEST VIA GUARD:
bundle exec guard -i
