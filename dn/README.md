INSTALL DEPENDENCIES:
```shell
$ nuget restore -PackagesDirectory packages
```

STATIC CODE ANALYSIS:
```shell
$ .\packages\Mono.Gendarme.2.11.0.20121120\tools\gendarme.exe .\RomanNumeral\bin\Debug\RomanNumeral.dll
```

START AUTOTEST:
```shell
$ powershell
$ .\giles.ps1
```
