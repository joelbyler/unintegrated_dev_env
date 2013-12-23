INSTALL DEPENDENCIES:
```shell
$ nuget restore -PackagesDirectory packages
```

START AUTOTEST:
```shell
$ powershell
$ .\giles.ps1
```

STATIC CODE ANALYSIS:
```shell
$ .\packages\Mono.Gendarme.2.11.0.20121120\tools\gendarme.exe .\RomanNumeral\bin\Debug\RomanNumeral.dll
```
