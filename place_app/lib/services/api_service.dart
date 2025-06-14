import 'dart:convert';
import 'package:http/http.dart' as http;
import '../models/place.dart';

class ApiService {
static const String baseUrl = 'http://192.168.16.102:8080/api/place';

  static Future<List<Place>> getAllPlace() async {
    final response = await http.get(Uri.parse('$baseUrl/getAllPlace'));

    if (response.statusCode == 200) {
      List jsonResponse = json.decode(response.body);
      return jsonResponse.map((place) => Place.fromJson(place)).toList();
    } else {
      throw Exception('Failed to load places');
    }
  }
}
