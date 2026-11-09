//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pokemon_encounter_detail_response.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/version_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_encounter_version_detail_response.g.dart';

/// PokemonEncounterVersionDetailResponse
///
/// Properties:
/// * [version] - The game version this encounter happens in.
/// * [maxChance] - The total percentage of all encounter potential.
/// * [encounterDetails] - A list of encounters and their specifics.
@BuiltValue()
abstract class PokemonEncounterVersionDetailResponse implements Built<PokemonEncounterVersionDetailResponse, PokemonEncounterVersionDetailResponseBuilder> {
  /// The game version this encounter happens in.
  @BuiltValueField(wireName: r'version')
  VersionSummary get version;

  /// The total percentage of all encounter potential.
  @BuiltValueField(wireName: r'max_chance')
  int get maxChance;

  /// A list of encounters and their specifics.
  @BuiltValueField(wireName: r'encounter_details')
  BuiltList<PokemonEncounterDetailResponse> get encounterDetails;

  PokemonEncounterVersionDetailResponse._();

  factory PokemonEncounterVersionDetailResponse([void updates(PokemonEncounterVersionDetailResponseBuilder b)]) = _$PokemonEncounterVersionDetailResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonEncounterVersionDetailResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonEncounterVersionDetailResponse> get serializer => _$PokemonEncounterVersionDetailResponseSerializer();
}

class _$PokemonEncounterVersionDetailResponseSerializer implements PrimitiveSerializer<PokemonEncounterVersionDetailResponse> {
  @override
  final Iterable<Type> types = const [PokemonEncounterVersionDetailResponse, _$PokemonEncounterVersionDetailResponse];

  @override
  final String wireName = r'PokemonEncounterVersionDetailResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonEncounterVersionDetailResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'version';
    yield serializers.serialize(
      object.version,
      specifiedType: const FullType(VersionSummary),
    );
    yield r'max_chance';
    yield serializers.serialize(
      object.maxChance,
      specifiedType: const FullType(int),
    );
    yield r'encounter_details';
    yield serializers.serialize(
      object.encounterDetails,
      specifiedType: const FullType(BuiltList, [FullType(PokemonEncounterDetailResponse)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonEncounterVersionDetailResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonEncounterVersionDetailResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'version':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(VersionSummary),
          ) as VersionSummary;
          result.version.replace(valueDes);
          break;
        case r'max_chance':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.maxChance = valueDes;
          break;
        case r'encounter_details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonEncounterDetailResponse)]),
          ) as BuiltList<PokemonEncounterDetailResponse>;
          result.encounterDetails.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonEncounterVersionDetailResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonEncounterVersionDetailResponseBuilder();
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


