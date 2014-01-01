
STATIC CODE ANALYSIS:
```shell
$ gradle findbugsMain
```

INSTALL GUARD DEPENDENCIES:
```shell
$ bundle install
```

START AUTOTEST VIA GUARD:
```shell
$ bundle exec guard
```

START Jetty:
```shell
$ gradle jettyRun
```

STOP GRADLE DAEMON (started by guard):
```shell
$ gradle --stop
```
