//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/location_area_summary.dart';
import 'package:openapi/src/model/pokemon_encounter_version_detail_response.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_encounter_response.g.dart';

/// PokemonEncounterResponse
///
/// Properties:
/// * [locationArea] - The location area the referenced Pokémon can be encountered in.
/// * [versionDetails] - A list of versions and encounters with the referenced Pokémon that might happen.
@BuiltValue()
abstract class PokemonEncounterResponse implements Built<PokemonEncounterResponse, PokemonEncounterResponseBuilder> {
  /// The location area the referenced Pokémon can be encountered in.
  @BuiltValueField(wireName: r'location_area')
  LocationAreaSummary get locationArea;

  /// A list of versions and encounters with the referenced Pokémon that might happen.
  @BuiltValueField(wireName: r'version_details')
  BuiltList<PokemonEncounterVersionDetailResponse> get versionDetails;

  PokemonEncounterResponse._();

  factory PokemonEncounterResponse([void updates(PokemonEncounterResponseBuilder b)]) = _$PokemonEncounterResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonEncounterResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonEncounterResponse> get serializer => _$PokemonEncounterResponseSerializer();
}

class _$PokemonEncounterResponseSerializer implements PrimitiveSerializer<PokemonEncounterResponse> {
  @override
  final Iterable<Type> types = const [PokemonEncounterResponse, _$PokemonEncounterResponse];

  @override
  final String wireName = r'PokemonEncounterResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonEncounterResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'location_area';
    yield serializers.serialize(
      object.locationArea,
      specifiedType: const FullType(LocationAreaSummary),
    );
    yield r'version_details';
    yield serializers.serialize(
      object.versionDetails,
      specifiedType: const FullType(BuiltList, [FullType(PokemonEncounterVersionDetailResponse)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonEncounterResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonEncounterResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'location_area':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(LocationAreaSummary),
          ) as LocationAreaSummary;
          result.locationArea.replace(valueDes);
          break;
        case r'version_details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonEncounterVersionDetailResponse)]),
          ) as BuiltList<PokemonEncounterVersionDetailResponse>;
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
  PokemonEncounterResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonEncounterResponseBuilder();
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


