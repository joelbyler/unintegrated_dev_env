Giles library for auto testing 
nuget for package management
  http://docs.nuget.org/docs/reference/versioning
    Currently, locking a package to a specific version range requires hand-edited the packages.config file.

    <?xml version="1.0" encoding="utf-8"?>
    <packages>
        <package id="nunit" version="2.6.3" allowedVersions="[2,3)" />
        <package id="giles" version="0.1.5" allowedVersions="[2,3)" />
    </packages>

C:\...>nuget restore -PackagesDirectory packages


PM> Enable-PackageRestore
Attempting to resolve dependency 'NuGet.CommandLine (≥ 1.4)'.
Successfully installed 'NuGet.CommandLine 1.4.20615.182'.
Successfully installed 'NuGet.Build 0.16'.

Copying nuget.exe and msbuild scripts to D:\Code\StarterApps\Mvc3Application\.nuget
Successfully uninstalled 'NuGet.Build 0.16'.
Successfully uninstalled 'NuGet.CommandLine 1.4.20615.182'.

Don't forget to commit the .nuget folder
Updated 'Mvc3Application' to use 'NuGet.targets'
Enabled package restore for Mvc3Application
