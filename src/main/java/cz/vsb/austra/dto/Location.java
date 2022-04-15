package cz.vsb.austra.dto;

public class Location {
 private String name;
 private String country;
 private String region;
 private String lat;
 private String lon;
 private String timezone_id;
 private String localtime;
 private float localtime_epoch;
 private String utc_offset;


 // Getter Methods 

 public String getName() {
  return name;
 }

 public String getCountry() {
  return country;
 }

 public String getRegion() {
  return region;
 }

 public String getLat() {
  return lat;
 }

 public String getLon() {
  return lon;
 }

 public String getTimezone_id() {
  return timezone_id;
 }

 public String getLocaltime() {
  return localtime;
 }

 public float getLocaltime_epoch() {
  return localtime_epoch;
 }

 public String getUtc_offset() {
  return utc_offset;
 }

 // Setter Methods 

 public void setName(String name) {
  this.name = name;
 }

 public void setCountry(String country) {
  this.country = country;
 }

 public void setRegion(String region) {
  this.region = region;
 }

 public void setLat(String lat) {
  this.lat = lat;
 }

 public void setLon(String lon) {
  this.lon = lon;
 }

 public void setTimezone_id(String timezone_id) {
  this.timezone_id = timezone_id;
 }

 public void setLocaltime(String localtime) {
  this.localtime = localtime;
 }

 public void setLocaltime_epoch(float localtime_epoch) {
  this.localtime_epoch = localtime_epoch;
 }

 public void setUtc_offset(String utc_offset) {
  this.utc_offset = utc_offset;
 }
}