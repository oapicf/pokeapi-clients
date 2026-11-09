//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/version_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'location_area_encounter_version_detail.g.dart';

/// LocationAreaEncounterVersionDetail
///
/// Properties:
/// * [rate] - The chance of an encounter to occur.
/// * [version] - The version of the game in which the encounter can occur with the given chance.
@BuiltValue()
abstract class LocationAreaEncounterVersionDetail implements Built<LocationAreaEncounterVersionDetail, LocationAreaEncounterVersionDetailBuilder> {
  /// The chance of an encounter to occur.
  @BuiltValueField(wireName: r'rate')
  int get rate;

  /// The version of the game in which the encounter can occur with the given chance.
  @BuiltValueField(wireName: r'version')
  VersionSummary get version;

  LocationAreaEncounterVersionDetail._();

  factory LocationAreaEncounterVersionDetail([void updates(LocationAreaEncounterVersionDetailBuilder b)]) = _$LocationAreaEncounterVersionDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LocationAreaEncounterVersionDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LocationAreaEncounterVersionDetail> get serializer => _$LocationAreaEncounterVersionDetailSerializer();
}

class _$LocationAreaEncounterVersionDetailSerializer implements PrimitiveSerializer<LocationAreaEncounterVersionDetail> {
  @override
  final Iterable<Type> types = const [LocationAreaEncounterVersionDetail, _$LocationAreaEncounterVersionDetail];

  @override
  final String wireName = r'LocationAreaEncounterVersionDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LocationAreaEncounterVersionDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'rate';
    yield serializers.serialize(
      object.rate,
      specifiedType: const FullType(int),
    );
    yield r'version';
    yield serializers.serialize(
      object.version,
      specifiedType: const FullType(VersionSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LocationAreaEncounterVersionDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LocationAreaEncounterVersionDetailBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'rate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.rate = valueDes;
          break;
        case r'version':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(VersionSummary),
          ) as VersionSummary;
          result.version.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LocationAreaEncounterVersionDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LocationAreaEncounterVersionDetailBuilder();
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


