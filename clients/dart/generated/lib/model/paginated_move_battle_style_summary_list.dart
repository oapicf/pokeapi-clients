//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PaginatedMoveBattleStyleSummaryList {
  /// Returns a new [PaginatedMoveBattleStyleSummaryList] instance.
  PaginatedMoveBattleStyleSummaryList({
    required this.count,
    this.next,
    this.previous,
    this.results = const [],
  });

  /// The total number of resources available from this API.
  int count;

  /// The URL for the next page in the list, or null if there is no next page.
  String? next;

  /// The URL for the previous page in the list, or null if there is no previous page.
  String? previous;

  /// A list of API resources on this page.
  List<MoveBattleStyleSummary> results;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PaginatedMoveBattleStyleSummaryList &&
    other.count == count &&
    other.next == next &&
    other.previous == previous &&
    _deepEquality.equals(other.results, results);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (count.hashCode) +
    (next == null ? 0 : next!.hashCode) +
    (previous == null ? 0 : previous!.hashCode) +
    (results.hashCode);

  @override
  String toString() => 'PaginatedMoveBattleStyleSummaryList[count=$count, next=$next, previous=$previous, results=$results]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'count'] = this.count;
    if (this.next != null) {
      json[r'next'] = this.next;
    } else {
      json[r'next'] = null;
    }
    if (this.previous != null) {
      json[r'previous'] = this.previous;
    } else {
      json[r'previous'] = null;
    }
      json[r'results'] = this.results;
    return json;
  }

  /// Returns a new [PaginatedMoveBattleStyleSummaryList] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PaginatedMoveBattleStyleSummaryList? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'count'), 'Required key "PaginatedMoveBattleStyleSummaryList[count]" is missing from JSON.');
        assert(json[r'count'] != null, 'Required key "PaginatedMoveBattleStyleSummaryList[count]" has a null value in JSON.');
        assert(json.containsKey(r'results'), 'Required key "PaginatedMoveBattleStyleSummaryList[results]" is missing from JSON.');
        assert(json[r'results'] != null, 'Required key "PaginatedMoveBattleStyleSummaryList[results]" has a null value in JSON.');
        return true;
      }());

      return PaginatedMoveBattleStyleSummaryList(
        count: mapValueOfType<int>(json, r'count')!,
        next: mapValueOfType<String>(json, r'next'),
        previous: mapValueOfType<String>(json, r'previous'),
        results: MoveBattleStyleSummary.listFromJson(json[r'results']),
      );
    }
    return null;
  }

  static List<PaginatedMoveBattleStyleSummaryList> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PaginatedMoveBattleStyleSummaryList>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PaginatedMoveBattleStyleSummaryList.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PaginatedMoveBattleStyleSummaryList> mapFromJson(dynamic json) {
    final map = <String, PaginatedMoveBattleStyleSummaryList>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PaginatedMoveBattleStyleSummaryList.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PaginatedMoveBattleStyleSummaryList-objects as value to a dart map
  static Map<String, List<PaginatedMoveBattleStyleSummaryList>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PaginatedMoveBattleStyleSummaryList>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PaginatedMoveBattleStyleSummaryList.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'count',
    'results',
  };
}

