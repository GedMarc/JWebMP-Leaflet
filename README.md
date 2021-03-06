# JWebMP-Leaflet
Use the Leaflet Mappings and  directly through JWebMP

Example for a basic map : 
```
Leaflet leaflet = new Leaflet();
leaflet.getOptions().setCenter(new LatitudeLongitueArray(51.505, -0.09));
leaflet.getOptions().setDragging(true);
```
As a feature on any component :
```
LeafletFeature leafletFeature = new LeafletFeature(getInstance().getBody());
leafletFeature.getOptions().setBoxZoom(true);
```

# Leaflet JS

Leaflet is the leading open-source JavaScript library for mobile-friendly interactive maps. Weighing just about 38 KB of JS, it has all the mapping features most developers ever need.

Leaflet is designed with simplicity, performance and usability in mind. It works efficiently across all major desktop and mobile platforms, can be extended with lots of plugins, has a beautiful, easy to use and well-documented API and a simple, readable source code that is a joy to contribute to.

Leaflet JS Link
http://leafletjs.com/index.html

