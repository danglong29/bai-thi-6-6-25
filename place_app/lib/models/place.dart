class Place {
  final int id;
  final String name;
  final String description;
  final String imageUrl;
  final double rating;

  Place({
    required this.id,
    required this.name,
    required this.description,
    required this.imageUrl,
    required this.rating,
  });

  factory Place.fromJson(Map<String, dynamic> json) {
    return Place(
      id: json['id'] is int ? json['id'] : int.parse(json['id'].toString()),
      name: json['name'] ?? '',
      description: json['description'] ?? '',
      imageUrl: json['imageUrl'] ?? '', // Sửa thành 'image_url' nếu backend trả key đó
      rating: json['rating'] != null
          ? (json['rating'] is double
              ? json['rating']
              : double.tryParse(json['rating'].toString()) ?? 0)
          : 0,
    );
  }
}
