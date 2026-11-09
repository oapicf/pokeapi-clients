//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/encounter_method_summary.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/location_area_encounter_version_detail.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'location_area_encounter_rate.g.dart';

/// LocationAreaEncounterRate
///
/// Properties:
/// * [encounterMethod] - The method in which Pokémon may be encountered in an area..
/// * [versionDetails] - The chance of the encounter to occur on a version of the game.
@BuiltValue()
abstract class LocationAreaEncounterRate implements Built<LocationAreaEncounterRate, LocationAreaEncounterRateBuilder> {
  /// The method in which Pokémon may be encountered in an area..
  @BuiltValueField(wireName: r'encounter_method')
  EncounterMethodSummary get encounterMethod;

  /// The chance of the encounter to occur on a version of the game.
  @BuiltValueField(wireName: r'version_details')
  BuiltList<LocationAreaEncounterVersionDetail> get versionDetails;

  LocationAreaEncounterRate._();

  factory LocationAreaEncounterRate([void updates(LocationAreaEncounterRateBuilder b)]) = _$LocationAreaEncounterRate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LocationAreaEncounterRateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LocationAreaEncounterRate> get serializer => _$LocationAreaEncounterRateSerializer();
}

class _$LocationAreaEncounterRateSerializer implements PrimitiveSerializer<LocationAreaEncounterRate> {
  @override
  final Iterable<Type> types = const [LocationAreaEncounterRate, _$LocationAreaEncounterRate];

  @override
  final String wireName = r'LocationAreaEncounterRate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LocationAreaEncounterRate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'encounter_method';
    yield serializers.serialize(
      object.encounterMethod,
      specifiedType: const FullType(EncounterMethodSummary),
    );
    yield r'version_details';
    yield serializers.serialize(
      object.versionDetails,
      specifiedType: const FullType(BuiltList, [FullType(LocationAreaEncounterVersionDetail)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LocationAreaEncounterRate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LocationAreaEncounterRateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'encounter_method':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(EncounterMethodSummary),
          ) as EncounterMethodSummary;
          result.encounterMethod.replace(valueDes);
          break;
        case r'version_details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(LocationAreaEncounterVersionDetail)]),
          ) as BuiltList<LocationAreaEncounterVersionDetail>;
          result.versionDetails.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LocationAreaEncounterRate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LocationAreaEncounterRateBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}


