//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'location_area_detail_encounter_method_rates_inner_version_details_inner.g.dart';

/// LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner
///
/// Properties:
/// * [rate] 
/// * [version] 
@BuiltValue()
abstract class LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner implements Built<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner, LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerBuilder> {
  @BuiltValueField(wireName: r'rate')
  int get rate;

  @BuiltValueField(wireName: r'version')
  AbilityDetailPokemonInnerPokemon get version;

  LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner._();

  factory LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner([void updates(LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerBuilder b)]) = _$LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> get serializer => _$LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerSerializer();
}

class _$LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerSerializer implements PrimitiveSerializer<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> {
  @override
  final Iterable<Type> types = const [LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner, _$LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner];

  @override
  final String wireName = r'LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner object, {
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
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerBuilder result,
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
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
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
  LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerBuilder();
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

