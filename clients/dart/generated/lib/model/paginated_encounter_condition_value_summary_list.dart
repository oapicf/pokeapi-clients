//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PaginatedEncounterConditionValueSummaryList {
  /// Returns a new [PaginatedEncounterConditionValueSummaryList] instance.
  PaginatedEncounterConditionValueSummaryList({
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
  List<EncounterConditionValueSummary> results;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PaginatedEncounterConditionValueSummaryList &&
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
  String toString() => 'PaginatedEncounterConditionValueSummaryList[count=$count, next=$next, previous=$previous, results=$results]';

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

  /// Returns a new [PaginatedEncounterConditionValueSummaryList] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PaginatedEncounterConditionValueSummaryList? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'count'), 'Required key "PaginatedEncounterConditionValueSummaryList[count]" is missing from JSON.');
        assert(json[r'count'] != null, 'Required key "PaginatedEncounterConditionValueSummaryList[count]" has a null value in JSON.');
        assert(json.containsKey(r'results'), 'Required key "PaginatedEncounterConditionValueSummaryList[results]" is missing from JSON.');
        assert(json[r'results'] != null, 'Required key "PaginatedEncounterConditionValueSummaryList[results]" has a null value in JSON.');
        return true;
      }());

      return PaginatedEncounterConditionValueSummaryList(
        count: mapValueOfType<int>(json, r'count')!,
        next: mapValueOfType<String>(json, r'next'),
        previous: mapValueOfType<String>(json, r'previous'),
        results: EncounterConditionValueSummary.listFromJson(json[r'results']),
      );
    }
    return null;
  }

  static List<PaginatedEncounterConditionValueSummaryList> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PaginatedEncounterConditionValueSummaryList>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PaginatedEncounterConditionValueSummaryList.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PaginatedEncounterConditionValueSummaryList> mapFromJson(dynamic json) {
    final map = <String, PaginatedEncounterConditionValueSummaryList>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PaginatedEncounterConditionValueSummaryList.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PaginatedEncounterConditionValueSummaryList-objects as value to a dart map
  static Map<String, List<PaginatedEncounterConditionValueSummaryList>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PaginatedEncounterConditionValueSummaryList>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PaginatedEncounterConditionValueSummaryList.listFromJson(entry.value, growable: growable,);
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

